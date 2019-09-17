/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.transfer;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Abstract base class for the information of a pausible upload or download; such
 * information can be used to resume the upload or download later on, and can be
 * serialized/deserialized for persistence purposes.
 */
public abstract class PersistableTransfer {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * Returns the serialized representation of the paused transfer state.
     */
    public final String serialize() {
        return Jackson.toJsonString(this);
    }

    /**
     * Writes the serialized representation of the paused transfer state to the
     * given <code>OutputStream</code>. Caller of this method should explicitly
     * close the <code>OutputStream</code>.
     */
    public final void serialize(OutputStream out) throws IOException {
        out.write(Jackson.toJsonString(this).getBytes(UTF8));
        out.flush();
    }

    /**
     * Returns the deserialized transfer state of the given serialized
     * representation. Caller of this method should explicitly close the
     * <code>InputStream</code>.
     *
     * @throws UnsupportedOperationException
     *             if the paused transfer type extracted from the serialized
     *             representation is not supported.
     */
    public static <T extends PersistableTransfer> T deserializeFrom(InputStream in) {
        String type;
        JsonNode tree;
        try {
            tree = MAPPER.readTree(in);
            JsonNode pauseType = tree.get("pauseType");
            if (pauseType == null)
                throw new IllegalArgumentException(
                        "Unrecognized serialized state");
            type = pauseType.asText();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        Class<?> clazz;
        if (PersistableDownload.TYPE.equals(type)) {
            clazz = PersistableDownload.class;
        } else if (PersistableUpload.TYPE.equals(type)) {
            clazz = PersistableUpload.class;
        } else {
            throw new UnsupportedOperationException(
                    "Unsupported paused transfer type: " + type);
        }
        try {
            @SuppressWarnings("unchecked")
            T t = (T) MAPPER.treeToValue(tree, clazz);
            return t;
        } catch (JsonProcessingException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Returns the deserialized transfer state of the given serialized
     * representation.
     *
     * @throws UnsupportedOperationException
     *             if the paused transfer type extracted from the serialized
     *             representation is not supported.
     */
    public static <T extends PersistableTransfer> T deserializeFrom(
            String serialized) {
        if (serialized == null)
            return null;
        ByteArrayInputStream byteStream = new ByteArrayInputStream(
                serialized.getBytes(UTF8));
        try{
            return deserializeFrom(byteStream);
        }finally{
            try { byteStream.close(); } catch(IOException ioe) { } ;
        }
    }
}
