package com.amazonaws.services.s3;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

public class ListObjectsTest {

    public static final String TEST_BUCKET_NAME = "test-bucket-name";
    private static final String RESOURCE_PATH = "/" + TEST_BUCKET_NAME + "/";
    private static final String PARTIAL_PAYLOAD = "<?xml version=\"1.0\" " +
            "encoding=\"UTF-8\"?>\n" +
            "<ListBucketResult xmlns=\"http://s3.amazonaws" +
            ".com/doc/2006-03-01/\">\n" +
            "    <Name>bucket</Name>\n" +
            "    <Prefix/>\n" +
            "    <Marker/>\n" +
            "    <MaxKeys>1000</MaxKeys>\n" +
            "    <IsTruncated>false</IsTruncated>";
    private static final String FAKE_REQUEST_ID = "fake-request-id";
    private static final String FAKE_EXTENDED_REQUEST_ID =
            "fake-ext-request-id";
    @Rule
    public WireMockRule mockServer = new WireMockRule(0);
    private AmazonS3 s3;

    @Before
    public void setUp() {
        s3 = new AmazonS3Client(new BasicAWSCredentials("fake-access-key",
                "fake-secret-access-key"), new ClientConfiguration().withProtocol(
                Protocol.HTTP));
        s3.setS3ClientOptions(new S3ClientOptions().withPathStyleAccess(true));
        s3.setEndpoint("http://localhost:" + mockServer.port());
    }


    @Test
    public void
    list_buckets_success_response_with_partial_payload_returns_exception() {

        mockServer.stubFor(get(urlEqualTo(RESOURCE_PATH)).willReturn(aResponse()
                .withStatus(200).withBody(PARTIAL_PAYLOAD).withHeader
                        (Headers.REQUEST_ID, FAKE_REQUEST_ID).withHeader
                        (Headers.EXTENDED_REQUEST_ID,
                                FAKE_EXTENDED_REQUEST_ID)));
        try {
            s3.listObjects(TEST_BUCKET_NAME);
            Assert.fail("An amazon s3 exception must be received here as the " +
                    "sdk cannot unmarshall list object response payload");
        } catch (AmazonClientException ace) {
            Assert.assertTrue(ace.getCause() instanceof AmazonS3Exception);
            AmazonS3Exception s3e = (AmazonS3Exception)ace.getCause();
            Assert.assertNotNull(s3e.getExtendedRequestId());
            Assert.assertNotNull(s3e.getRequestId());
            Assert.assertEquals(FAKE_REQUEST_ID, s3e.getRequestId());
            Assert.assertEquals(FAKE_EXTENDED_REQUEST_ID, s3e
                    .getExtendedRequestId());
        }
    }
}
