/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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
package com.amazonaws.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.AbortableHttpRequest;

import com.amazonaws.HttpMethod;

/**
 * Utility class to wrap InputStreams obtained from an HttpClient library's
 * HttpMethod object, and ensure the stream and HTTP connection are properly
 * released.
 * <p>
 * This input stream wrapper is used to ensure that input streams obtained
 * through HttpClient connections are cleaned up correctly once the caller has
 * read all the contents of the connection's input stream, or closed the input
 * stream. Additionally, this class attempts to release the connection and close
 * the stream in this object's finalizer method, as a last resort to avoid
 * leaking resources.
 * <p>
 * <b>Important!</b> This input stream must be completely consumed or closed to
 * ensure the necessary cleanup operations can be performed.
 */
public class HttpMethodReleaseInputStream extends InputStream {
    private static final Log log = LogFactory.getLog(HttpMethodReleaseInputStream.class);

    private InputStream inputStream = null;
    private HttpEntityEnclosingRequest httpRequest = null;
    private boolean alreadyReleased = false;
    private boolean underlyingStreamConsumed = false;

    /**
     * Constructs an input stream based on an {@link HttpMethod} object
     * representing an HTTP connection. If a connection input stream is
     * available, this constructor wraps the underlying input stream and makes
     * that stream available. If no underlying connection is available, an empty
     * {@link ByteArrayInputStream} is made available.
     * 
     * @param httpMethod
     *            The HTTP method being executed, whose response content is to
     *            be wrapped.
     */
    public HttpMethodReleaseInputStream(HttpEntityEnclosingRequest httpMethod) {
        this.httpRequest = httpMethod;

        try {
        	this.inputStream = httpMethod.getEntity().getContent();
        } catch (IOException e) {
        	if (log.isWarnEnabled()) {
        		log.warn("Unable to obtain HttpMethod's response data stream", e);
        	}
        	try {
        		httpMethod.getEntity().getContent().close();
        	} catch (Exception ex) {}
            this.inputStream = new ByteArrayInputStream(new byte[] {}); // Empty input stream;
        }
    }

    /**
     * Returns the underlying HttpMethod object that contains/manages the actual
     * HTTP connection.
     *
     * @return the HTTPMethod object that provides the data input stream.
     */
    public HttpEntityEnclosingRequest getHttpRequest() {
        return httpRequest;
    }

    /**
     * Forces the release of an HttpMethod's connection in a way that will
     * perform all the necessary cleanup through the correct use of HttpClient
     * methods.
     *
     * @throws IOException
     */
    protected void releaseConnection() throws IOException {
        if (!alreadyReleased) {
            if (!underlyingStreamConsumed) {
                // Underlying input stream has not been consumed, abort method
                // to force connection to be closed and cleaned-up.
            	if (httpRequest instanceof AbortableHttpRequest) {
            		AbortableHttpRequest abortableHttpRequest = (AbortableHttpRequest)httpRequest;
            		abortableHttpRequest.abort();
            	}
            }
            inputStream.close();
            alreadyReleased = true;
        }
    }

    /**
     * Standard input stream read method, except it calls
     * {@link #releaseConnection} when the underlying input stream is consumed.
     *
     * @see java.io.InputStream#read()
     */
    public int read() throws IOException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                underlyingStreamConsumed = true;
                if (!alreadyReleased) {
                    releaseConnection();
                    if (log.isDebugEnabled()) {
                    	log.debug("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e) {
            releaseConnection();
            if (log.isDebugEnabled()) {
            	log.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }

    /**
     * Standard input stream read method, except it calls
     * {@link #releaseConnection} when the underlying input stream is consumed.
     *
     * @see java.io.InputStream#read(byte[], int, int)
     */
    public int read(byte[] b, int off, int len) throws IOException {
        try {
            int read = inputStream.read(b, off, len);
            if (read == -1) {
                underlyingStreamConsumed = true;
                if (!alreadyReleased) {
                    releaseConnection();
                    if (log.isDebugEnabled()) {
                    	log.debug("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e) {
            releaseConnection();
            if (log.isDebugEnabled()) {
            	log.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }

    /**
     * Standard input stream available method, except it ensures that
     * {@link #releaseConnection()} is called if any errors are encountered from
     * the wrapped stream.
     *
     * @see java.io.InputStream#available()
     */
    public int available() throws IOException {
        try {
            return inputStream.available();
        } catch (IOException e) {
            releaseConnection();
            if (log.isDebugEnabled()) {
            	log.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }

    /**
     * Standard input stream close method, except it ensures that
     * {@link #releaseConnection()} is called before the input stream is closed.
     *
     * @see java.io.InputStream#close()
     */
    public void close() throws IOException {
        if (!alreadyReleased) {
            releaseConnection();
            if (log.isDebugEnabled()) {
            	log.debug("Released HttpMethod as its response data stream is closed");
            }
        }
        inputStream.close();
    }

    /**
     * Tries to ensure a connection is always cleaned-up correctly by calling
     * {@link #releaseConnection()} on class destruction if the cleanup hasn't
     * already been done.
     * <p>
     * This desperate cleanup act will only be necessary if the user of this
     * class does not completely consume or close this input stream prior to
     * object destruction. This method will log Warning messages if a forced
     * cleanup is required, hopefully reminding the user to close their streams
     * properly.
     */
    protected void finalize() throws Throwable {
        if (!alreadyReleased) {
        	if (log.isWarnEnabled()) {
        		log.warn("Attempting to release HttpMethod in finalize() as its response data stream has gone out of scope. "
                + "This attempt will not always succeed and cannot be relied upon! Please ensure S3 response data streams are "
                + "always fully consumed or closed to avoid HTTP connection starvation.");
        	}
            releaseConnection();
            if (log.isWarnEnabled()) {
            	log.warn("Successfully released HttpMethod in finalize(). You were lucky this time... "
                + "Please ensure S3 response data streams are always fully consumed or closed.");
            }
        }
        super.finalize();
    }

}
