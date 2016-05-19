package com.amazonaws.services.s3;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@code AmazonS3URI}.
 */
public class AmazonS3URITest {

    @Test
    public void testNoQueryParams() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertNull(uri.getVersionId());
    }

    @Test
    public void testUnrelatedQueryParams() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?unrelated=true"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertNull(uri.getVersionId());
    }

    @Test
    public void testVersionId() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=abc123"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertEquals("abc123", uri.getVersionId());
    }

    @Test
    public void testEncodedVersionId() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=%61%62%63%26123"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertEquals("abc&123", uri.getVersionId());
    }

    @Test
    public void testMultipleQueryParams() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?unrelated=true&versionId=%61%62%63123&unrelated=true"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertEquals("abc123", uri.getVersionId());
    }

    @Test
    public void testMultipleQueryParamsWithSemicolons() {
        AmazonS3URI uri  = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?unrelated=true;versionId=abc%3B%31%32%33;unrelated=true"));

        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-2", uri.getRegion());
        Assert.assertEquals("abc;123", uri.getVersionId());
    }

    @Test
    public void testEquals() {
        AmazonS3URI one = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"));

        AmazonS3URI two = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"));

        Assert.assertEquals(one, two);
        Assert.assertEquals(one.hashCode(), two.hashCode());
    }

    @Test
    public void testEqualsWithVersionId() {
        AmazonS3URI one = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=abc123"));

        AmazonS3URI two = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=abc123"));

        Assert.assertEquals(one, two);
        Assert.assertEquals(one.hashCode(), two.hashCode());
    }

    @Test
    public void testNotEquals() {
        AmazonS3URI one = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"));

        AmazonS3URI two = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/otherkey"));

        Assert.assertNotEquals(one, two);
        Assert.assertNotEquals(one.hashCode(), two.hashCode());
    }

    @Test
    public void testNotEqualsWithVersionId() {
        AmazonS3URI one = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=abc123"));

        AmazonS3URI two = new AmazonS3URI(URI.create(
                "https://s3-us-west-2.amazonaws.com/bucket/key"
                + "?versionId=def456"));

        Assert.assertNotEquals(one, two);
        Assert.assertNotEquals(one.hashCode(), two.hashCode());
    }
}
