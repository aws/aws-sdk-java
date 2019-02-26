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

import com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler;
import com.amazonaws.services.kinesisvideo.internal.netty.util.ChannelAttributeKeys;
import com.amazonaws.services.kinesisvideo.model.AckEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Delivers an unmarshalled {@link AckEvent} to a {@link PutMediaAckResponseHandler}.
 */
public class DeliverAckHandler extends SimpleChannelInboundHandler<AckEvent> {

    private final PutMediaAckResponseHandler responseHandler;

    public DeliverAckHandler(PutMediaAckResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    @Override
    public void channelRead0(final ChannelHandlerContext ctx, final AckEvent msg) {
        if (msg instanceof FinalAckEvent) {
            ctx.channel().attr(ChannelAttributeKeys.FINAL_ACK_RECEIVED).set(Boolean.TRUE);
            responseHandler.onComplete();
            ctx.close();
        } else {
            responseHandler.onAckEvent(msg);
        }
    }

}
