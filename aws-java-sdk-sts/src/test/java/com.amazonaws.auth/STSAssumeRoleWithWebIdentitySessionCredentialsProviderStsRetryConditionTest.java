package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.IDPCommunicationErrorException;
import com.amazonaws.services.securitytoken.model.InvalidIdentityTokenException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class STSAssumeRoleWithWebIdentitySessionCredentialsProviderStsRetryConditionTest {

    private STSAssumeRoleWithWebIdentitySessionCredentialsProvider.StsRetryCondition condition =
            new STSAssumeRoleWithWebIdentitySessionCredentialsProvider.StsRetryCondition();

    @Test
    public void shouldRetry_whenExceptionContainsInvalidIdentityTokenException() {
        AmazonClientException exception = new AmazonClientException(new InvalidIdentityTokenException("TestMessage"));
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionIsInvalidIdentityTokenException() {
        AmazonClientException exception = new InvalidIdentityTokenException("TestMessage");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionContainsIOException() {
        AmazonClientException exception = new AmazonClientException(new IOException("TestMessage"));
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionContainsIDPCommunicationErrorException() {
        AmazonClientException exception = new AmazonClientException(new IDPCommunicationErrorException("TestMessage"));
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionIsIDPCommunicationErrorException() {
        AmazonClientException exception = new IDPCommunicationErrorException("TestMessage");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionIsAmazonServiceException_andIsRetryableServiceException() {
        AmazonServiceException exception = new AmazonServiceException("TestMessage");
        exception.setErrorCode("RequestTimeout");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionIsAmazonServiceException_andIsThrottlingException() {
        AmazonServiceException exception = new AmazonServiceException("TestMessage");
        exception.setErrorCode("Throttling");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldRetry_whenExceptionIsAmazonServiceException_andIsClockSkewError() {
        AmazonServiceException exception = new AmazonServiceException("TestMessage");
        exception.setErrorCode("RequestExpired");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldNotRetry_whenExceptionIsSomethingElse() {
        AmazonClientException exception = new AmazonClientException("TestMessage");
        boolean actual = condition.shouldRetry(null, exception, 0);
        Assert.assertFalse(actual);
    }

}