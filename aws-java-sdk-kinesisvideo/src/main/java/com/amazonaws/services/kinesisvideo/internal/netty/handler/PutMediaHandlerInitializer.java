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

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.stream.ChunkedWriteHandler;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Initializer for PutMedia pipeline.
 */
public class PutMediaHandlerInitializer extends ChannelInitializer<Channel> {

    private static final Log log = LogFactory.getLog(PutMediaHandlerInitializer.class);

    private final SslContext sslContext;

    /**
     * Additional pipeline handlers to process PutMedia response and ack events. See {@link DeliverAckHandler}.
     */
    private final List<ChannelHandler> handlers;

    public PutMediaHandlerInitializer(SslContext sslContext, List<ChannelHandler> handlers) {
        this.sslContext = sslContext;
        this.handlers = new ArrayList<ChannelHandler>(handlers);
    }

    @Override
    public void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();

        if (log.isDebugEnabled()) {
            pipeline.addLast(new LoggingHandler());
        }
        if (sslContext != null) {
            pipeline.addLast("ssl", sslContext.newHandler(channel.alloc()));
        }

        pipeline.addLast("http-codec", new HttpClientCodec());
        for (ChannelHandler handler : handlers) {
            pipeline.addLast(handler);
        }
        pipeline.addLast("chunkedWriter", new ChunkedWriteHandler());
    }
}
