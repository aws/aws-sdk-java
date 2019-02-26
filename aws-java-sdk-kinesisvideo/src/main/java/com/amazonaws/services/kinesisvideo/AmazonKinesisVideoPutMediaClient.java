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
package com.amazonaws.services.kinesisvideo;

import com.amazonaws.AbortedException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.SdkJsonProtocolFactory;
import com.amazonaws.services.kinesisvideo.internal.auth.PutMediaAWS4Signer;
import com.amazonaws.services.kinesisvideo.internal.netty.handler.DeliverAckHandler;
import com.amazonaws.services.kinesisvideo.internal.netty.handler.ErrorUnmarshallingHandler;
import com.amazonaws.services.kinesisvideo.internal.netty.handler.PutMediaDecoder;
import com.amazonaws.services.kinesisvideo.internal.netty.handler.PutMediaHandlerInitializer;
import com.amazonaws.services.kinesisvideo.internal.netty.util.RequestAdapter;
import com.amazonaws.services.kinesisvideo.model.PutMediaRequest;
import com.amazonaws.services.kinesisvideo.model.transform.PutMediaRequestProtocolMarshaller;
import com.amazonaws.util.CredentialUtils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.VersionInfoUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.HttpChunkedInput;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.stream.ChunkedStream;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;

/**
 * Client implementation class for {@link AmazonKinesisVideoPutMedia}. To create, obtain an instance of the builder
 * via {@link AmazonKinesisVideoPutMediaClient#builder()} or {@link AmazonKinesisVideoPutMediaClientBuilder#standard()} and
 * call {@link AmazonKinesisVideoPutMediaClientBuilder#build()} after configuring desired options.
 */
public final class AmazonKinesisVideoPutMediaClient implements AmazonKinesisVideoPutMedia {

    private static final String USER_AGENT = "NettyPutMedia/" + VersionInfoUtils.getVersion();

    private final Signer signer;
    private final AWSCredentialsProvider credentialsProvider;
    private final URI endpoint;
    private final int connectionTimeoutInMillis;
    private final EventLoopGroup group;

    /**
     * Protocol factory used by normal client. Used for marshaller and error response handler creation.
     */
    private final SdkJsonProtocolFactory protocolFactory = AmazonKinesisVideoMediaClient.getProtocolFactory();

    AmazonKinesisVideoPutMediaClient(String region,
                                     AWSCredentialsProvider credentialsProvider,
                                     int connectionTimeoutInMillis,
                                     URI endpoint,
                                     Integer numberOfThreads) {
        this.signer = new PutMediaAWS4Signer(region);
        this.credentialsProvider = credentialsProvider;
        this.connectionTimeoutInMillis = connectionTimeoutInMillis;
        this.endpoint = endpoint;
        this.group = numberOfThreads == null ? new NioEventLoopGroup() : new NioEventLoopGroup(numberOfThreads);
    }

    @Override
    public void putMedia(PutMediaRequest request, PutMediaAckResponseHandler responseHandler) {
        doPutMedia(request.clone(), responseHandler,
                   Arrays.<ChannelHandler>asList(new PutMediaDecoder(), new DeliverAckHandler(responseHandler)));
    }

    private void doPutMedia(PutMediaRequest request,
                            PutMediaResponseHandler responseHandler,
                            List<ChannelHandler> requestHandlers) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        Request<PutMediaRequest> marshalled = marshall(request);
        applyUserAgent(request, marshalled);
        signer.sign(marshalled, resolveCredentials(request));

        try {
            Bootstrap b = new Bootstrap()
                .group(group)
                .channel(NioSocketChannel.class)
                .remoteAddress(marshalled.getEndpoint().getHost(), getPort(marshalled.getEndpoint()))
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, connectionTimeoutInMillis)
                .handler(new PutMediaHandlerInitializer(getSslContext(marshalled.getEndpoint()),
                                                        createHandlers(responseHandler, marshalled, requestHandlers)));
            invoke(marshalled, b, responseHandler);
        } catch (InterruptedException e) {
            throw handleInterruptedException(e);
        }
    }

    private List<ChannelHandler> createHandlers(PutMediaResponseHandler responseHandler,
                                                Request<PutMediaRequest> marshalled,
                                                List<ChannelHandler> requestHandlers) {
        List<ChannelHandler> handlers = new ArrayList<ChannelHandler>(requestHandlers);
        handlers.add(
            new ErrorUnmarshallingHandler(responseHandler,
                                          protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata()),
                                          marshalled));
        return handlers;
    }

    /**
     * Apply the user agent to the marshalled request (if not already present). Appends a custom marker to track usage of the
     * Netty based client.
     */
    private void applyUserAgent(PutMediaRequest request, Request<PutMediaRequest> marshalled) {
        if (!marshalled.getHeaders().containsKey("User-Agent")) {
            marshalled.addHeader("User-Agent",
                                 RuntimeHttpUtils.getUserAgent(new ClientConfiguration(),
                                                               request.getRequestClientOptions()
                                                                      .getClientMarker(RequestClientOptions.Marker.USER_AGENT)));
        }
    }

    /**
     * SDK does not throw checked exceptions so on interrupt we restore the interrupt flag and throw an
     * {@link AbortedException};
     *
     * @param e Original {@link InterruptedException}
     * @return Exception to throw.
     */
    private RuntimeException handleInterruptedException(InterruptedException e) {
        Thread.currentThread().interrupt();
        return new AbortedException("Interrupted while making PutMedia request", e);
    }

    /**
     * Netty needs an explicit port so resolve that from the endpoint provided.
     *
     * @param endpoint Configured endpoint
     * @return Port number to use.
     */
    private int getPort(URI endpoint) {
        if (endpoint.getPort() != -1) {
            return endpoint.getPort();
        } else if ("https".equals(endpoint.getScheme())) {
            return 443;
        } else {
            return 80;
        }
    }

    /**
     * Marshall the {@link PutMediaRequest} to a {@link Request}.
     *
     * @param request POJO request to marshall.
     * @return Marshalled request object.
     */
    private Request<PutMediaRequest> marshall(PutMediaRequest request) {
        Request<PutMediaRequest> marshalled = new PutMediaRequestProtocolMarshaller(protocolFactory).marshall(request);
        marshalled.setEndpoint(endpoint);
        marshalled.addHeader(HttpHeaderNames.TRANSFER_ENCODING.toString(), HttpHeaderValues.CHUNKED.toString());
        return marshalled;
    }

    /**
     * Resolve credentials which may be overridden at a per request level.
     *
     * @param request Request being made.
     * @return Credentials to use or null if no credentials found.
     */
    private AWSCredentials resolveCredentials(PutMediaRequest request) {
        AWSCredentialsProvider resolvedProvider = CredentialUtils.getCredentialsProvider(request, credentialsProvider);
        AWSCredentials resolvedCredentials = resolvedProvider == null ? null : resolvedProvider.getCredentials();
        if (resolvedCredentials == null) {
            throw new SdkClientException(
                "Credentials must be provided via the builder or present in the environment. " +
                "See http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html");
        }
        return resolvedCredentials;
    }

    /**
     * Create an {@link javax.net.ssl.SSLContext} for the Netty Bootstrap.
     *
     * @param uri URI of request.
     * @return Null if not over SSL, otherwise configured {@link javax.net.ssl.SSLContext} to use.
     */
    private SslContext getSslContext(URI uri) {
        if (!"https".equalsIgnoreCase(uri.getScheme())) {
            return null;
        }
        try {
            return SslContextBuilder.forClient().build();
        } catch (SSLException e) {
            throw new SdkClientException("Could not create SSL context", e);
        }
    }

    /**
     * Invoke a marshalled {@link Request} using Netty as the transport.
     *
     * @param marshalledRequest Marshalled request to invoke.
     * @param b Netty bootstrap to use.
     */
    private void invoke(final Request<?> marshalledRequest, final Bootstrap b, final PutMediaResponseHandler responseHandler) throws InterruptedException {
        b.connect().addListener(new GenericFutureListener<ChannelFuture>() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                try {
                    Channel channel = future.channel();

                    HttpRequest request = RequestAdapter.adapt(marshalledRequest);

                    // Send request
                    channel.writeAndFlush(request);

                    // Send chunked content
                    channel.writeAndFlush(new HttpChunkedInput(new ChunkedStream(marshalledRequest.getContent())));
                } catch (Exception e) {
                    responseHandler.onFailure(e);
                }
            }
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    public void close() {
        // Wait for the group to shutdown synchronously.
        final CountDownLatch latch = new CountDownLatch(1);
        // TODO Can't figure out what generics are needed here
        group.shutdownGracefully().addListener(new GenericFutureListener() {
            @Override
            public void operationComplete(Future future) throws Exception {
                latch.countDown();
            }
        });
        try {
            latch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw handleInterruptedException(e);
        }
    }

    /**
     * Create a new builder instance that can configure and create an {@link AmazonKinesisVideoPutMedia} client.
     *
     * @return Builder instance.
     */
    public static AmazonKinesisVideoPutMediaClientBuilder builder() {
        return new AmazonKinesisVideoPutMediaClientBuilder();
    }

}
