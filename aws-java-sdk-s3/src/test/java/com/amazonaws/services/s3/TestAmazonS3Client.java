/*
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
package com.amazonaws.services.s3;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.services.s3.internal.SkipMd5CheckStrategy;
import com.amazonaws.services.s3.model.GetObjectRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.easymock.EasyMock;
import org.easymock.IArgumentMatcher;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TestAmazonS3Client {
  private ConnectionManagerAwareHttpClient httpClient;
  private AmazonS3Client s3Client;

  @Before
  public void setUp() {
    BasicAWSCredentials creds = new BasicAWSCredentials("key", "secret");
    ClientConfiguration config = new ClientConfiguration();
    httpClient = EasyMock.createMock(ConnectionManagerAwareHttpClient.class);
    AWSCredentialsProvider credentials = EasyMock.createMock(AWSCredentialsProvider.class);
    EasyMock.expect(credentials.getCredentials()).andReturn(creds).anyTimes();
    EasyMock.replay(credentials);
    AmazonHttpClient amazonHttpClient = new AmazonHttpClient(config, httpClient, null);
    s3Client = new AmazonS3Client(credentials, config, null,
        SkipMd5CheckStrategy.INSTANCE, amazonHttpClient);
  }

  /**
   * Test to make sure that the request to get the tail of the an S3 object
   * is passed correctly to the http request.
   */
  @Test
  public void testGetTailOfObject() throws IOException {

    // Mock the request to get the region
    HttpResponse bucketResponse = new BasicHttpResponse(
        new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 200, "OK"));
    bucketResponse.setHeader("x-amz-bucket-region", "us-west-1");
    EasyMock.expect(httpClient.execute(
        requestMatcher("HEAD", "https://mybucket.s3.amazonaws.com/"),
        EasyMock.anyObject(HttpContext.class)))
        .andReturn(bucketResponse);

    // Mock the request for the last 100 bytes of obj1
    HttpResponse objectResponse = new BasicHttpResponse(
        new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 200, "OK"));
    EasyMock.expect(httpClient.execute(
        requestMatcher("GET", "https://mybucket.s3.us-west-1.amazonaws.com/obj1",
            "Range", "bytes=-10"),
        EasyMock.anyObject(HttpContext.class)))
        .andReturn(objectResponse);

    // Mock the request for bytes 20-30 of obj2
    EasyMock.expect(httpClient.execute(
        requestMatcher("GET", "https://mybucket.s3.us-west-1.amazonaws.com/obj2",
            "Range", "bytes=20-30"),
        EasyMock.anyObject(HttpContext.class)))
        .andReturn(objectResponse);

    // Mock the request for obj3
    EasyMock.expect(httpClient.execute(
        requestMatcher("GET", "https://mybucket.s3.us-west-1.amazonaws.com/obj3"),
        EasyMock.anyObject(HttpContext.class)))
        .andReturn(objectResponse);

    EasyMock.replay(httpClient);
    s3Client.getObject(new GetObjectRequest("mybucket", "obj1").withRange(-10));
    s3Client.getObject(new GetObjectRequest("mybucket", "obj2").withRange(20,30));
    s3Client.getObject(new GetObjectRequest("mybucket", "obj3"));
    EasyMock.verify(httpClient);
  }

  public static HttpUriRequest requestMatcher(String method, String URL,
                                              String... headers) {
    EasyMock.reportMatcher(new RequestMatcher(method, URL, headers));
    return null;
  }

  public static class RequestMatcher implements IArgumentMatcher {
    private final String method;
    private final String URL;
    private final String[] headers;

    RequestMatcher(String method, String URL, String... headers) {
      this.method = method;
      this.URL = URL;
      this.headers = headers;
    }

    @Override
    public boolean matches(Object o) {
      if (!(o instanceof HttpUriRequest)) {
        return false;
      }
      HttpUriRequest request = (HttpUriRequest) o;
      if (!method.equals(request.getMethod()) ||
              !URL.equals(request.getURI().toString())) {
        return false;
      }
      for(int i=0; i < headers.length; i += 2) {
        if (!headers[i+1].equals(request.getFirstHeader(headers[i]).getValue())) {
          return false;
        }
      }
      return true;
    }

    @Override
    public void appendTo(StringBuffer stringBuffer) {
      stringBuffer.append("GetRequestMatcher(");
      stringBuffer.append(method);
      stringBuffer.append(',');
      stringBuffer.append(URL);
      stringBuffer.append(",[");
      for(int i=0; i < headers.length; i += 2) {
        stringBuffer.append(headers[i]);
        stringBuffer.append('=');
        stringBuffer.append(headers[i+1]);
      }
      stringBuffer.append("])");
    }
  }
}
