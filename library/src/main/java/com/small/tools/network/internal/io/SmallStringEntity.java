package com.small.tools.network.internal.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * author: admin
 * date: 2017/03/02
 * version: 0
 * mail: secret
 * desc: RequestStringEntity
 */

public class SmallStringEntity implements SmallEntity {

    byte[] content;
    String mCharSet;

    public SmallStringEntity(String text){
        this(text, "utf-8");
    }

    public SmallStringEntity(String text, String charset){
        try {
            text = text == null?"":text;
            mCharSet = charset;
            content = text.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            content = new byte[]{};
        }
    }

    @Override
    public void writeTo(OutputStream os) throws IOException{
        os.write(this.content);
        os.flush();
    }

    @Override
    public InputStream getContent() {
        return new ByteArrayInputStream(content);
    }

    @Override
    public long getContentLength() {
        return content.length;
    }

    @Override
    public String getContentEncoding() {
        return mCharSet;
    }
}
