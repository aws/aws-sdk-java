/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisvideo.internal.netty.handler;

import static io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR;

import com.amazonaws.services.kinesisvideo.model.AckEvent;
import com.amazonaws.services.kinesisvideo.model.transform.AckEventUnmarshaller;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import java.io.IOException;
import java.util.List;

/**
 * Decoder for PutMedia response. This decodes HttpObject objects (HttpResponse,
 * HttpContent) into HttpResponse and AckEvent objects and passes those to the
 * next channel handler in the pipeline.
 */
// TODO revisit when wire format is finalized
public class PutMediaDecoder extends MessageToMessageDecoder<HttpObject> {

    private static final AckEventUnmarshaller UNMARSHALLER = new AckEventUnmarshaller();

    private static final byte NEW_LINE = '\n';

    private final ByteToMessageDecoder.Cumulator cumulator;
    private ByteBuf cumulation = Unpooled.EMPTY_BUFFER;
    private boolean isSuccessResponse;

    public PutMediaDecoder() {
        this.cumulator = MERGE_CUMULATOR;
    }

    /**
     * Decode ByteBuf to AckEvent objects.
     *
     * @param in         byte buf
     * @param decodedOut list of AckEvent objects
     */
    private static void decodeAckEvent(ByteBuf in, List<Object> decodedOut) throws IOException {
        int readerIndex = in.readerIndex();
        int writerIndex = in.writerIndex();
        for (; readerIndex < writerIndex; ++readerIndex) {
            // Read one byte at a time to avoid incrementing reader index
            byte c = in.getByte(readerIndex);
            if (NEW_LINE == c) {
                ByteBuf json = extractObject(in, in.readerIndex(), readerIndex - in.readerIndex());
                if (json != null) {
                    decodedOut.add(unmarshall(json));
                }

                in.readerIndex(readerIndex + 1);
                in.discardReadBytes();
                // Reader and writer index shift after discard. Update them
                readerIndex = in.readerIndex();
                writerIndex = in.writerIndex();
                ReferenceCountUtil.release(json);
            }
        }
    }

    /**
     * Unmarshalls the JSON into an {@link AckEvent} object.
     *
     * @param json JSON data.
     * @return AckEvent object.
     * @throws IOException If JSON is invalid.
     */
    private static AckEvent unmarshall(ByteBuf json) throws IOException {
        JsonNode jsonNode = Jackson.getObjectMapper().readTree(json.toString(CharsetUtil.UTF_8));
        return UNMARSHALLER.unmarshall(jsonNode);
    }

    private static ByteBuf extractObject(ByteBuf buffer, int index, int length) {
        return buffer.retainedSlice(index, length);
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext,
                          HttpObject httpObject,
                          List<Object> decodedOut) throws Exception {

        if (httpObject instanceof HttpResponse) {
            HttpResponse response = (HttpResponse) httpObject;
            isSuccessResponse = response.status().equals(HttpResponseStatus.OK) && HttpUtil.isTransferEncodingChunked(response);
        }

        if (httpObject instanceof HttpContent) {
            if (isSuccessResponse) {
                ByteBuf data = ((HttpContent) httpObject).content();

                // The cumulator will release the object but so will the MessageToMessageDecoder so explicitly retain it.
                data.retain();
                cumulation = cumulator.cumulate(channelHandlerContext.alloc(), cumulation, data);

                try {
                    decodeAckEvent(this.cumulation, decodedOut);
                } catch (IOException e) {
                    channelHandlerContext.fireExceptionCaught(e);
                }
                // Send a special ack event to acknowledge all events have been received.
                if (httpObject instanceof LastHttpContent) {
                    decodedOut.add(new FinalAckEvent());
                    ReferenceCountUtil.release(cumulation);
                }
            }
        }
        // If it's not a success response then send it down the pipeline to be handled by ErrorUnmarshallingHandler
        if (!isSuccessResponse) {
            // MessageToMessageDecoder automatically releases messages so we need to retain it explicitly
            ReferenceCountUtil.retain(httpObject);
            channelHandlerContext.fireChannelRead(httpObject);
        }
    }
}
