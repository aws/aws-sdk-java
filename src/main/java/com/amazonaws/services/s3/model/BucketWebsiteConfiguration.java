/*
 * Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Bucket configuration options for hosting static websites entirely out of
 * Amazon S3.
 * <p>
 * To host a static website in Amazon S3, create a bucket, upload your files,
 * and set the bucket website configuration. Once your bucket has been
 * configured as a website, you can access all your content via the Amazon S3
 * website endpoint. To ensure that the existing Amazon S3 REST API will
 * continue to behave the same, regardless of whether or not your bucket has
 * been configured to host a website, a new HTTP endpoint has been introduced
 * where you can access your website content. The bucket content you want to
 * make available via the website must be publicly readable.
 * <p>
 * To enable hosting websites, Amazon S3 introduces the following
 * concepts/features:
 * <ul>
 *   <li><b>Website endpoints</b> - When you configure a bucket as a website, the website
 *   is available via the the region-specific website endpoint where the bucket
 *   resides.
 *   <li><b>Index document support</b> - When configuring a bucket as a website you must
 *   provide an index document name. This is the webpage that Amazon S3 returns when
 *   it receives a request to the root of your website, or one of its
 *   subdirectories. Amazon S3 supports index documents in subdirectories.
 *   <li><b>Error document support</b> - Should an error occur, Amazon S3 will return an
 *   HTML error document, instead of an XML document.You can optionally provide
 *   your own error document that contains HTML, or any other static content
 *   specific to your website. You provide the error document name when you
 *   configure a bucket as a website. If you provide the custom error document,
 *   Amazon S3 returns your custom error document when an HTTP 4XX class error
 *   occurs. For other error non-4XX class errors, Amazon S3 will return its own
 *   error document.
 * </ul>
 * <p>
 * For more information on how to host a website on Amazon S3, see:
 * <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html">http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html</a>.
 *
 * @see AmazonS3#setBucketWebsiteConfiguration(String, BucketWebsiteConfiguration)
 * @see AmazonS3#getBucketWebsiteConfiguration(String)
 * @see AmazonS3#deleteBucketWebsiteConfiguration(String)
 */
public class BucketWebsiteConfiguration {

	/**
	 * The document to serve when a directory is specified (ex: index.html).
	 * This path is relative to the requested resource.
	 */
	private String indexDocumentSuffix;

	/** The complete path to the document to serve for 4xx errors. */
	private String errorDocument;


	/**
	 * Creates a new BucketWebsiteConfiguration with the specified index
	 * document suffix.
	 *
	 * @param indexDocumentSuffix
	 *            The document to serve when a directory is specified (ex:
	 *            index.html). This path is relative to the requested resource.
	 */
	public BucketWebsiteConfiguration(String indexDocumentSuffix) {
		this.indexDocumentSuffix = indexDocumentSuffix;
	}

	/**
	 * Creates a new BucketWebsiteConfiguration with the specified index
	 * document suffix and error document.
	 *
	 * @param indexDocumentSuffix
	 *            The document to serve when a directory is specified (ex:
	 *            index.html). This path is relative to the requested resource.
	 * @param errorDocument
	 *            The complete path to the document to serve for 4xx errors.
	 */
	public BucketWebsiteConfiguration(String indexDocumentSuffix, String errorDocument) {
		this.indexDocumentSuffix = indexDocumentSuffix;
		this.errorDocument = errorDocument;
	}

	/**
	 * Returns the document to serve when a directory is specified (ex:
	 * index.html). This path is relative to the requested resource.
	 *
	 * @return The document to serve when a directory is specified (ex:
	 *         index.html). This path is relative to the requested resource.
	 */
	public String getIndexDocumentSuffix() {
		return indexDocumentSuffix;
	}

	/**
	 * Sets the document to serve when a directory is specified (ex:
	 * index.html). This path is relative to the requested resource.
	 *
	 * @param indexDocumentSuffix
	 *            The document to serve when a directory is specified (ex:
	 *            index.html). This path is relative to the requested resource.
	 */
	public void setIndexDocumentSuffix(String indexDocumentSuffix) {
		this.indexDocumentSuffix = indexDocumentSuffix;
	}

	/**
	 * Returns the complete path to the document to serve for 4xx errors, or
	 * null if no error document has been configured.
	 *
	 * @return The complete path to the document to serve for 4xx errors, or
	 *         null if no error document has been configured.
	 */
	public String getErrorDocument() {
		return errorDocument;
	}

	/**
	 * Sets the complete path to the document to serve for 4xx errors.
	 *
	 * @param errorDocument
	 *            The complete path to the document to serve for 4xx errors.
	 */
	public void setErrorDocument(String errorDocument) {
		this.errorDocument = errorDocument;
	}
}