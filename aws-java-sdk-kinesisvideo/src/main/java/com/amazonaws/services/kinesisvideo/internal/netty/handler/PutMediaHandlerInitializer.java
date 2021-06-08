/*
 * Copyright 2012-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
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
    private final String host;
    private final int port;

    public PutMediaHandlerInitializer(SslContext sslContext, List<ChannelHandler> handlers, String host, int port) {
        this.sslContext = sslContext;
        this.handlers = new ArrayList<ChannelHandler>(handlers);
        this.host = host;
        this.port = port;
    }

    @Override
    public void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();

        if (log.isDebugEnabled()) {
            pipeline.addLast(new LoggingHandler());
        }
        if (sslContext != null) {
            SslHandler sslHandler = sslContext.newHandler(channel.alloc(), host, port);
            configureSslEngine(sslHandler.engine());
            pipeline.addLast("ssl", sslHandler);
        }

        pipeline.addLast("http-codec", new HttpClientCodec());
        for (ChannelHandler handler : handlers) {
            pipeline.addLast(handler);
        }
        pipeline.addLast("chunkedWriter", new ChunkedWriteHandler());
    }

    /**
     * Enable HostName verification.
     *
     * See https://netty.io/4.0/api/io/netty/handler/ssl/SslContext.html#newHandler-io.netty.buffer.ByteBufAllocator-java.lang
     * .String-int-
     *
     * @param sslEngine the sslEngine to configure
     */
    private void configureSslEngine(SSLEngine sslEngine) {
        SSLParameters sslParameters = sslEngine.getSSLParameters();
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");
        sslEngine.setSSLParameters(sslParameters);
    }
}
