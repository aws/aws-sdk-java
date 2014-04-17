/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.internal.SdkFilterInputStream;

public class HttpUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Regex which matches any of the sequences that we need to fix up after
     * URLEncoder.encode().
     */
    private static final Pattern ENCODED_CHARACTERS_PATTERN;
    static {
        StringBuilder pattern = new StringBuilder();

        pattern
            .append(Pattern.quote("+"))
            .append("|")
            .append(Pattern.quote("*"))
            .append("|")
            .append(Pattern.quote("%7E"))
            .append("|")
            .append(Pattern.quote("%2F"));

        ENCODED_CHARACTERS_PATTERN = Pattern.compile(pattern.toString());
    }

    /**
     * Encode a string for use in the path of a URL; uses URLEncoder.encode,
     * (which encodes a string for use in the query portion of a URL), then
     * applies some postfilters to fix things up per the RFC. Can optionally
     * handle strings which are meant to encode a path (ie include '/'es
     * which should NOT be escaped).
     *
     * @param value the value to encode
     * @param path true if the value is intended to represent a path
     * @return the encoded value
     */
    public static String urlEncode(final String value, final boolean path) {
        if (value == null) {
            return "";
        }

        try {
            String encoded = URLEncoder.encode(value, DEFAULT_ENCODING);

            Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encoded);
            StringBuffer buffer = new StringBuffer(encoded.length());

            while (matcher.find()) {
                String replacement = matcher.group(0);

                if ("+".equals(replacement)) {
                    replacement = "%20";
                } else if ("*".equals(replacement)) {
                    replacement = "%2A";
                } else if ("%7E".equals(replacement)) {
                    replacement = "~";
                } else if (path && "%2F".equals(replacement)) {
                    replacement = "/";
                }

                matcher.appendReplacement(buffer, replacement);
            }

            matcher.appendTail(buffer);
            return buffer.toString();

        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Returns true if the specified URI is using a non-standard port (i.e. any
     * port other than 80 for HTTP URIs or any port other than 443 for HTTPS
     * URIs).
     *
     * @param uri
     *
     * @return True if the specified URI is using a non-standard port, otherwise
     *         false.
     */
    public static boolean isUsingNonDefaultPort(URI uri) {
        String scheme = uri.getScheme().toLowerCase();
        int port = uri.getPort();

        if (port <= 0) return false;
        if (scheme.equals("http") && port == 80) return false;
        if (scheme.equals("https") && port == 443) return false;

        return true;
    }

    public static boolean usePayloadForQueryParameters(Request<?> request) {
        boolean requestIsPOST = HttpMethodName.POST.equals(request.getHttpMethod());
        boolean requestHasNoPayload = (request.getContent() == null);

        return requestIsPOST && requestHasNoPayload;
    }

    /**
     * Creates an encoded query string from all the parameters in the specified
     * request.
     *
     * @param request
     *            The request containing the parameters to encode.
     *
     * @return Null if no parameters were present, otherwise the encoded query
     *         string for the parameters present in the specified request.
     */
    public static String encodeParameters(Request<?> request) {
        List<NameValuePair> nameValuePairs = null;
        if (request.getParameters().size() > 0) {
            nameValuePairs = new ArrayList<NameValuePair>(request.getParameters().size());
            for (Entry<String, String> entry : request.getParameters().entrySet()) {
                nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }

        String encodedParams = null;
        if (nameValuePairs != null) {
            encodedParams = URLEncodedUtils.format(nameValuePairs, DEFAULT_ENCODING);
        }

        return encodedParams;
    }

    /**
     * Append the given path to the given baseUri.
     * By default, all slash characters in path will not be url-encoded.
     */
    public static String appendUri(String baseUri, String path) {
        return appendUri(baseUri, path, false);
    }
    
    /**
     * Append the given path to the given baseUri.
     *
     * <p>This method will encode the given path but not the given
     * baseUri.</p>
     *
     * @param baseUri The URI to append to (required, may be relative)
     * @param path The path to append (may be null or empty)
     * @param escapeDoubleSlash Whether double-slash in the path should be escaped to "/%2F"
     * @return The baseUri with the (encoded) path appended
     */
    public static String appendUri(final String baseUri, String path, final boolean escapeDoubleSlash ) {
        String resultUri = baseUri;
        if (path != null && path.length() > 0) {
            if (path.startsWith("/")) {
                // trim the trailing slash in baseUri, since the path already starts with a slash
                if (resultUri.endsWith("/")) {
                    resultUri = resultUri.substring(0, resultUri.length() - 1);
                }
            } else if (!resultUri.endsWith("/")) {
                resultUri += "/";
            }
            String encodedPath = HttpUtils.urlEncode(path, true);
            if (escapeDoubleSlash) {
                encodedPath = encodedPath.replace("//", "/%2F");
            }
            resultUri += encodedPath;
        } else if (!resultUri.endsWith("/")) {
            resultUri += "/";
        }

        return resultUri;
    }

    /**
     * Fetches a file from the URI given and returns an input stream to it.
     *
     * @param uri the uri of the file to fetch
     * @param config optional configuration overrides
     * @return an InputStream containing the retrieved data
     * @throws IOException on error
     */
    public static InputStream fetchFile(
            final URI uri,
            final ClientConfiguration config) throws IOException {

        HttpParams httpClientParams = new BasicHttpParams();
        HttpProtocolParams.setUserAgent(
                httpClientParams, getUserAgent(config));

        HttpConnectionParams.setConnectionTimeout(
                httpClientParams, getConnectionTimeout(config));
        HttpConnectionParams.setSoTimeout(
                httpClientParams, getSocketTimeout(config));

        DefaultHttpClient httpclient = new DefaultHttpClient(httpClientParams);

        if (config != null) {
            String proxyHost = config.getProxyHost();
            int proxyPort = config.getProxyPort();

            if (proxyHost != null && proxyPort > 0) {

                HttpHost proxy = new HttpHost(proxyHost, proxyPort);
                httpclient.getParams().setParameter(
                        ConnRoutePNames.DEFAULT_PROXY, proxy);

                if (config.getProxyUsername() != null
                    && config.getProxyPassword() != null) {

                    httpclient.getCredentialsProvider().setCredentials(
                            new AuthScope(proxyHost, proxyPort),
                            new NTCredentials(config.getProxyUsername(),
                                              config.getProxyPassword(),
                                              config.getProxyWorkstation(),
                                              config.getProxyDomain()));
                }
            }
        }

        HttpResponse response = httpclient.execute(new HttpGet(uri));

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new IOException("Error fetching file from " + uri + ": "
                                  + response);
        }

        return new HttpClientWrappingInputStream(
                httpclient,
                response.getEntity().getContent());
    }

    /**
     * An {@code InputStream} that closes the associated {@code HttpClient}
     * when the stream is closed.
     */
    private static class HttpClientWrappingInputStream
            extends SdkFilterInputStream {

        private final HttpClient client;

        /**
         * @param client the {@code HttpClient} to wrap
         * @param stream the {@code InputStream} to wrap
         */
        public HttpClientWrappingInputStream(
                final HttpClient client,
                final InputStream stream) {

            super(stream);
            this.client = client;
        }

        @Override
        public void close() throws IOException {
            try {
                super.close();
            } finally {
                client.getConnectionManager().shutdown();
            }
        }
    }

    private static String getUserAgent(final ClientConfiguration config) {
        String userAgent = null;

        if (config != null) {
            userAgent = config.getUserAgent();
        }

        if (userAgent == null) {
            userAgent = ClientConfiguration.DEFAULT_USER_AGENT;
        } else if (!ClientConfiguration.DEFAULT_USER_AGENT.equals(userAgent)) {
            userAgent += ", " + ClientConfiguration.DEFAULT_USER_AGENT;
        }

        return userAgent;
    }

    private static int getConnectionTimeout(final ClientConfiguration config) {
        if (config != null) {
            return config.getConnectionTimeout();
        }
        return ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT;
    }

    private static int getSocketTimeout(final ClientConfiguration config) {
        if (config != null) {
            return config.getSocketTimeout();
        }
        return ClientConfiguration.DEFAULT_SOCKET_TIMEOUT;
    }
}