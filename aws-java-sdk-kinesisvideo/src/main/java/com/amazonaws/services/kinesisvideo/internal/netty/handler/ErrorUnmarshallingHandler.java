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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler;
import com.amazonaws.services.kinesisvideo.PutMediaResponseHandler;
import com.amazonaws.services.kinesisvideo.internal.netty.util.ChannelAttributeKeys;
import com.amazonaws.util.BinaryUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.util.ReferenceCountUtil;

import java.io.ByteArrayInputStream;
import java.util.Map;

/**
 * Handles unmarshalling service errors and deals with errors thrown by the pipeline (usually IO related exceptions). Notifies
 * the {@link PutMediaAckResponseHandler} when errors occur.
 */
public class ErrorUnmarshallingHandler extends ChannelInboundHandlerAdapter {

    /**
     * Strategy for combining chunks of data into one {@link ByteBuf}.
     */
    private final ByteToMessageDecoder.Cumulator cumulator = ByteToMessageDecoder.MERGE_CUMULATOR;

    /**
     * Callback to notify customer of any errors received.
     */
    private final PutMediaResponseHandler responseHandler;

    /**
     * Unmarshaller for error responses from the service.
     */
    private final HttpResponseHandler<AmazonServiceException> errorResponseHandler;

    /**
     * Container for an non-2xx response from the service for error unmarshalling.
     */
    private final com.amazonaws.http.HttpResponse errorResponse;

    /**
     * Current cumulation of HTTP content data.
     */
    private ByteBuf cumulation = Unpooled.EMPTY_BUFFER;

    /**
     * Flag to make sure we only notify {@link PutMediaAckResponseHandler#onFailure(Throwable)} once.
     */
    private boolean notifiedOnFailure;

    public ErrorUnmarshallingHandler(PutMediaResponseHandler responseHandler,
                                     HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                                     Request<?> request) {
        this.responseHandler = responseHandler;
        this.errorResponseHandler = errorResponseHandler;
        // Eagerly create the error response to serve as a container for dumping HTTP data into
        this.errorResponse = new com.amazonaws.http.HttpResponse(request, null);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpResponse) {
            HttpResponse resp = (HttpResponse) msg;
            // Make sure it's a failure first
            if (resp.status().code() >= 300) {
                dumpToSdkHttpResponse(resp);
            }
        }

        if (msg instanceof HttpContent) {
            cumulateContent(ctx, (HttpContent) msg);
        }
        if (msg instanceof LastHttpContent) {
            try {
                responseHandler.onFailure(unmarshallError());
            } catch (Exception e) {
                responseHandler.onFailure(new SdkClientException("Unable to unmarshall error response.", e));
            } finally {
                notifiedOnFailure = true;
                ReferenceCountUtil.release(cumulation);
                ctx.close();
            }
        }
    }

    /**
     * Dump the Netty {@link HttpResponse} to the SDK {@link com.amazonaws.http.HttpResponse} container.
     *
     * @param resp Response to adapt.
     */
    private void dumpToSdkHttpResponse(HttpResponse resp) {
        errorResponse.setStatusCode(resp.status().code());
        errorResponse.setStatusText(resp.status().reasonPhrase());
        for (Map.Entry<String, String> header : resp.headers().entries()) {
            errorResponse.addHeader(header.getKey(), header.getValue());
        }
    }

    /**
     * Adds the current {@link HttpContent} to the cumulation of data.
     *
     * @param ctx Channel context.
     * @param msg Current {@link HttpContent} message.
     */
    private void cumulateContent(ChannelHandlerContext ctx, HttpContent msg) {
        cumulation = cumulator.cumulate(ctx.alloc(), cumulation, msg.content());
    }

    /**
     * We've received all the error content so send it off to the error response handler to produce the service exception.
     */
    private AmazonServiceException unmarshallError() throws Exception {
        errorResponse.setContent(new ByteArrayInputStream(BinaryUtils.copyBytesFrom(cumulation.nioBuffer())));
        return errorResponseHandler.handle(errorResponse);
    }

    /**
     * An exception was propagated from further up the pipeline (probably an IO exception of some sort). Notify the handler and
     * kill the connection.
     */
    @Override
    public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) throws Exception {
        if (!notifiedOnFailure) {
            notifiedOnFailure = true;
            try {
                responseHandler.onFailure(new SdkClientException("Unable to execute HTTP request.", cause));
            } finally {
                ctx.channel().close();
            }
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        if (!notifiedOnFailure) {
            notifiedOnFailure = true;
            if (!Boolean.TRUE.equals(ctx.channel().attr(ChannelAttributeKeys.FINAL_ACK_RECEIVED).get())) {
                responseHandler.onFailure(new SdkClientException("Service closed connection before final AckEvent was received"));
            }
        }
    }
}
