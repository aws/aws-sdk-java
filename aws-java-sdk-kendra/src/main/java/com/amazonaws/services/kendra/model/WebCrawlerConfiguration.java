/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information required for Amazon Kendra web crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/WebCrawlerConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebCrawlerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     * </p>
     * <p>
     * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     * Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web
     * crawler to index your own webpages, or webpages that you have authorization to index.</i>
     * </p>
     */
    private Urls urls;
    /**
     * <p>
     * Specifies the number of levels in a website that you want to crawl.
     * </p>
     * <p>
     * The first level begins from the website seed or starting point URL. For example, if a website has 3 levels –
     * index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in
     * crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1.
     * </p>
     * <p>
     * The default crawl depth is set to 2.
     * </p>
     */
    private Integer crawlDepth;
    /**
     * <p>
     * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage.
     * </p>
     * <p>
     * As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     * crawled in order of appearance.
     * </p>
     * <p>
     * The default maximum links per page is 100.
     * </p>
     */
    private Integer maxLinksPerPage;
    /**
     * <p>
     * The maximum size (in MB) of a webpage or attachment to crawl.
     * </p>
     * <p>
     * Files larger than this size (in MB) are skipped/not crawled.
     * </p>
     * <p>
     * The default maximum size of a webpage or attachment is set to 50 MB.
     * </p>
     */
    private Float maxContentSizePerPageInMegaBytes;
    /**
     * <p>
     * The maximum number of URLs crawled per website host per minute.
     * </p>
     * <p>
     * A minimum of one URL is required.
     * </p>
     * <p>
     * The default maximum number of URLs crawled per website host per minute is 300.
     * </p>
     */
    private Integer maxUrlsPerMinuteCrawlRate;
    /**
     * <p>
     * The regular expression pattern to include certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern, the
     * exclude pattern takes precedence.
     * </p>
     */
    private java.util.List<String> urlInclusionPatterns;
    /**
     * <p>
     * The regular expression pattern to exclude certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern, the
     * exclude pattern takes precedence.
     * </p>
     */
    private java.util.List<String> urlExclusionPatterns;
    /**
     * <p>
     * Provides configuration information required to connect to your internal websites via a web proxy.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication. To store web proxy credentials, you use a secret in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     * </p>
     */
    private ProxyConfiguration proxyConfiguration;
    /**
     * <p>
     * Provides configuration information required to connect to websites using authentication.
     * </p>
     * <p>
     * You can connect to websites using basic authentication of user name and password.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You use a
     * secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets
     * Manager</a> to store your authentication credentials.
     * </p>
     */
    private AuthenticationConfiguration authenticationConfiguration;

    /**
     * <p>
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     * </p>
     * <p>
     * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     * Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web
     * crawler to index your own webpages, or webpages that you have authorization to index.</i>
     * </p>
     * 
     * @param urls
     *        Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to
     *        crawl.</p>
     *        <p>
     *        You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     *        </p>
     *        <p>
     *        <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     *        Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra
     *        web crawler to index your own webpages, or webpages that you have authorization to index.</i>
     */

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    /**
     * <p>
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     * </p>
     * <p>
     * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     * Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web
     * crawler to index your own webpages, or webpages that you have authorization to index.</i>
     * </p>
     * 
     * @return Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to
     *         crawl.</p>
     *         <p>
     *         You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     *         </p>
     *         <p>
     *         <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     *         Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra
     *         web crawler to index your own webpages, or webpages that you have authorization to index.</i>
     */

    public Urls getUrls() {
        return this.urls;
    }

    /**
     * <p>
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     * </p>
     * <p>
     * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     * Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web
     * crawler to index your own webpages, or webpages that you have authorization to index.</i>
     * </p>
     * 
     * @param urls
     *        Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to
     *        crawl.</p>
     *        <p>
     *        You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs.
     *        </p>
     *        <p>
     *        <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon
     *        Acceptable Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra
     *        web crawler to index your own webpages, or webpages that you have authorization to index.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withUrls(Urls urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * Specifies the number of levels in a website that you want to crawl.
     * </p>
     * <p>
     * The first level begins from the website seed or starting point URL. For example, if a website has 3 levels –
     * index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in
     * crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1.
     * </p>
     * <p>
     * The default crawl depth is set to 2.
     * </p>
     * 
     * @param crawlDepth
     *        Specifies the number of levels in a website that you want to crawl.</p>
     *        <p>
     *        The first level begins from the website seed or starting point URL. For example, if a website has 3 levels
     *        – index level (i.e. seed in this example), sections level, and subsections level – and you are only
     *        interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to
     *        1.
     *        </p>
     *        <p>
     *        The default crawl depth is set to 2.
     */

    public void setCrawlDepth(Integer crawlDepth) {
        this.crawlDepth = crawlDepth;
    }

    /**
     * <p>
     * Specifies the number of levels in a website that you want to crawl.
     * </p>
     * <p>
     * The first level begins from the website seed or starting point URL. For example, if a website has 3 levels –
     * index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in
     * crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1.
     * </p>
     * <p>
     * The default crawl depth is set to 2.
     * </p>
     * 
     * @return Specifies the number of levels in a website that you want to crawl.</p>
     *         <p>
     *         The first level begins from the website seed or starting point URL. For example, if a website has 3
     *         levels – index level (i.e. seed in this example), sections level, and subsections level – and you are
     *         only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your
     *         depth to 1.
     *         </p>
     *         <p>
     *         The default crawl depth is set to 2.
     */

    public Integer getCrawlDepth() {
        return this.crawlDepth;
    }

    /**
     * <p>
     * Specifies the number of levels in a website that you want to crawl.
     * </p>
     * <p>
     * The first level begins from the website seed or starting point URL. For example, if a website has 3 levels –
     * index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in
     * crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1.
     * </p>
     * <p>
     * The default crawl depth is set to 2.
     * </p>
     * 
     * @param crawlDepth
     *        Specifies the number of levels in a website that you want to crawl.</p>
     *        <p>
     *        The first level begins from the website seed or starting point URL. For example, if a website has 3 levels
     *        – index level (i.e. seed in this example), sections level, and subsections level – and you are only
     *        interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to
     *        1.
     *        </p>
     *        <p>
     *        The default crawl depth is set to 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withCrawlDepth(Integer crawlDepth) {
        setCrawlDepth(crawlDepth);
        return this;
    }

    /**
     * <p>
     * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage.
     * </p>
     * <p>
     * As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     * crawled in order of appearance.
     * </p>
     * <p>
     * The default maximum links per page is 100.
     * </p>
     * 
     * @param maxLinksPerPage
     *        The maximum number of URLs on a webpage to include when crawling a website. This number is per
     *        webpage.</p>
     *        <p>
     *        As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     *        crawled in order of appearance.
     *        </p>
     *        <p>
     *        The default maximum links per page is 100.
     */

    public void setMaxLinksPerPage(Integer maxLinksPerPage) {
        this.maxLinksPerPage = maxLinksPerPage;
    }

    /**
     * <p>
     * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage.
     * </p>
     * <p>
     * As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     * crawled in order of appearance.
     * </p>
     * <p>
     * The default maximum links per page is 100.
     * </p>
     * 
     * @return The maximum number of URLs on a webpage to include when crawling a website. This number is per
     *         webpage.</p>
     *         <p>
     *         As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage
     *         are crawled in order of appearance.
     *         </p>
     *         <p>
     *         The default maximum links per page is 100.
     */

    public Integer getMaxLinksPerPage() {
        return this.maxLinksPerPage;
    }

    /**
     * <p>
     * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage.
     * </p>
     * <p>
     * As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     * crawled in order of appearance.
     * </p>
     * <p>
     * The default maximum links per page is 100.
     * </p>
     * 
     * @param maxLinksPerPage
     *        The maximum number of URLs on a webpage to include when crawling a website. This number is per
     *        webpage.</p>
     *        <p>
     *        As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are
     *        crawled in order of appearance.
     *        </p>
     *        <p>
     *        The default maximum links per page is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withMaxLinksPerPage(Integer maxLinksPerPage) {
        setMaxLinksPerPage(maxLinksPerPage);
        return this;
    }

    /**
     * <p>
     * The maximum size (in MB) of a webpage or attachment to crawl.
     * </p>
     * <p>
     * Files larger than this size (in MB) are skipped/not crawled.
     * </p>
     * <p>
     * The default maximum size of a webpage or attachment is set to 50 MB.
     * </p>
     * 
     * @param maxContentSizePerPageInMegaBytes
     *        The maximum size (in MB) of a webpage or attachment to crawl.</p>
     *        <p>
     *        Files larger than this size (in MB) are skipped/not crawled.
     *        </p>
     *        <p>
     *        The default maximum size of a webpage or attachment is set to 50 MB.
     */

    public void setMaxContentSizePerPageInMegaBytes(Float maxContentSizePerPageInMegaBytes) {
        this.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
    }

    /**
     * <p>
     * The maximum size (in MB) of a webpage or attachment to crawl.
     * </p>
     * <p>
     * Files larger than this size (in MB) are skipped/not crawled.
     * </p>
     * <p>
     * The default maximum size of a webpage or attachment is set to 50 MB.
     * </p>
     * 
     * @return The maximum size (in MB) of a webpage or attachment to crawl.</p>
     *         <p>
     *         Files larger than this size (in MB) are skipped/not crawled.
     *         </p>
     *         <p>
     *         The default maximum size of a webpage or attachment is set to 50 MB.
     */

    public Float getMaxContentSizePerPageInMegaBytes() {
        return this.maxContentSizePerPageInMegaBytes;
    }

    /**
     * <p>
     * The maximum size (in MB) of a webpage or attachment to crawl.
     * </p>
     * <p>
     * Files larger than this size (in MB) are skipped/not crawled.
     * </p>
     * <p>
     * The default maximum size of a webpage or attachment is set to 50 MB.
     * </p>
     * 
     * @param maxContentSizePerPageInMegaBytes
     *        The maximum size (in MB) of a webpage or attachment to crawl.</p>
     *        <p>
     *        Files larger than this size (in MB) are skipped/not crawled.
     *        </p>
     *        <p>
     *        The default maximum size of a webpage or attachment is set to 50 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withMaxContentSizePerPageInMegaBytes(Float maxContentSizePerPageInMegaBytes) {
        setMaxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The maximum number of URLs crawled per website host per minute.
     * </p>
     * <p>
     * A minimum of one URL is required.
     * </p>
     * <p>
     * The default maximum number of URLs crawled per website host per minute is 300.
     * </p>
     * 
     * @param maxUrlsPerMinuteCrawlRate
     *        The maximum number of URLs crawled per website host per minute.</p>
     *        <p>
     *        A minimum of one URL is required.
     *        </p>
     *        <p>
     *        The default maximum number of URLs crawled per website host per minute is 300.
     */

    public void setMaxUrlsPerMinuteCrawlRate(Integer maxUrlsPerMinuteCrawlRate) {
        this.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
    }

    /**
     * <p>
     * The maximum number of URLs crawled per website host per minute.
     * </p>
     * <p>
     * A minimum of one URL is required.
     * </p>
     * <p>
     * The default maximum number of URLs crawled per website host per minute is 300.
     * </p>
     * 
     * @return The maximum number of URLs crawled per website host per minute.</p>
     *         <p>
     *         A minimum of one URL is required.
     *         </p>
     *         <p>
     *         The default maximum number of URLs crawled per website host per minute is 300.
     */

    public Integer getMaxUrlsPerMinuteCrawlRate() {
        return this.maxUrlsPerMinuteCrawlRate;
    }

    /**
     * <p>
     * The maximum number of URLs crawled per website host per minute.
     * </p>
     * <p>
     * A minimum of one URL is required.
     * </p>
     * <p>
     * The default maximum number of URLs crawled per website host per minute is 300.
     * </p>
     * 
     * @param maxUrlsPerMinuteCrawlRate
     *        The maximum number of URLs crawled per website host per minute.</p>
     *        <p>
     *        A minimum of one URL is required.
     *        </p>
     *        <p>
     *        The default maximum number of URLs crawled per website host per minute is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withMaxUrlsPerMinuteCrawlRate(Integer maxUrlsPerMinuteCrawlRate) {
        setMaxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate);
        return this;
    }

    /**
     * <p>
     * The regular expression pattern to include certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @return The regular expression pattern to include certain URLs to crawl.</p>
     *         <p>
     *         If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern,
     *         the exclude pattern takes precedence.
     */

    public java.util.List<String> getUrlInclusionPatterns() {
        return urlInclusionPatterns;
    }

    /**
     * <p>
     * The regular expression pattern to include certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @param urlInclusionPatterns
     *        The regular expression pattern to include certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern,
     *        the exclude pattern takes precedence.
     */

    public void setUrlInclusionPatterns(java.util.Collection<String> urlInclusionPatterns) {
        if (urlInclusionPatterns == null) {
            this.urlInclusionPatterns = null;
            return;
        }

        this.urlInclusionPatterns = new java.util.ArrayList<String>(urlInclusionPatterns);
    }

    /**
     * <p>
     * The regular expression pattern to include certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern, the
     * exclude pattern takes precedence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrlInclusionPatterns(java.util.Collection)} or {@link #withUrlInclusionPatterns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param urlInclusionPatterns
     *        The regular expression pattern to include certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern,
     *        the exclude pattern takes precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withUrlInclusionPatterns(String... urlInclusionPatterns) {
        if (this.urlInclusionPatterns == null) {
            setUrlInclusionPatterns(new java.util.ArrayList<String>(urlInclusionPatterns.length));
        }
        for (String ele : urlInclusionPatterns) {
            this.urlInclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regular expression pattern to include certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @param urlInclusionPatterns
     *        The regular expression pattern to include certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to exclude certain URLs that conflicts with the include pattern,
     *        the exclude pattern takes precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withUrlInclusionPatterns(java.util.Collection<String> urlInclusionPatterns) {
        setUrlInclusionPatterns(urlInclusionPatterns);
        return this;
    }

    /**
     * <p>
     * The regular expression pattern to exclude certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @return The regular expression pattern to exclude certain URLs to crawl.</p>
     *         <p>
     *         If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern,
     *         the exclude pattern takes precedence.
     */

    public java.util.List<String> getUrlExclusionPatterns() {
        return urlExclusionPatterns;
    }

    /**
     * <p>
     * The regular expression pattern to exclude certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @param urlExclusionPatterns
     *        The regular expression pattern to exclude certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern,
     *        the exclude pattern takes precedence.
     */

    public void setUrlExclusionPatterns(java.util.Collection<String> urlExclusionPatterns) {
        if (urlExclusionPatterns == null) {
            this.urlExclusionPatterns = null;
            return;
        }

        this.urlExclusionPatterns = new java.util.ArrayList<String>(urlExclusionPatterns);
    }

    /**
     * <p>
     * The regular expression pattern to exclude certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern, the
     * exclude pattern takes precedence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrlExclusionPatterns(java.util.Collection)} or {@link #withUrlExclusionPatterns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param urlExclusionPatterns
     *        The regular expression pattern to exclude certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern,
     *        the exclude pattern takes precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withUrlExclusionPatterns(String... urlExclusionPatterns) {
        if (this.urlExclusionPatterns == null) {
            setUrlExclusionPatterns(new java.util.ArrayList<String>(urlExclusionPatterns.length));
        }
        for (String ele : urlExclusionPatterns) {
            this.urlExclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regular expression pattern to exclude certain URLs to crawl.
     * </p>
     * <p>
     * If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern, the
     * exclude pattern takes precedence.
     * </p>
     * 
     * @param urlExclusionPatterns
     *        The regular expression pattern to exclude certain URLs to crawl.</p>
     *        <p>
     *        If there is a regular expression pattern to include certain URLs that conflicts with the exclude pattern,
     *        the exclude pattern takes precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withUrlExclusionPatterns(java.util.Collection<String> urlExclusionPatterns) {
        setUrlExclusionPatterns(urlExclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Provides configuration information required to connect to your internal websites via a web proxy.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication. To store web proxy credentials, you use a secret in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     * </p>
     * 
     * @param proxyConfiguration
     *        Provides configuration information required to connect to your internal websites via a web proxy.</p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     *        </p>
     *        <p>
     *        Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *        basic authentication. To store web proxy credentials, you use a secret in <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     */

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * <p>
     * Provides configuration information required to connect to your internal websites via a web proxy.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication. To store web proxy credentials, you use a secret in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     * </p>
     * 
     * @return Provides configuration information required to connect to your internal websites via a web proxy.</p>
     *         <p>
     *         You must provide the website host name and port number. For example, the host name of
     *         https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     *         </p>
     *         <p>
     *         Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *         basic authentication. To store web proxy credentials, you use a secret in <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     */

    public ProxyConfiguration getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    /**
     * <p>
     * Provides configuration information required to connect to your internal websites via a web proxy.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     * </p>
     * <p>
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic
     * authentication. To store web proxy credentials, you use a secret in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     * </p>
     * 
     * @param proxyConfiguration
     *        Provides configuration information required to connect to your internal websites via a web proxy.</p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
     *        </p>
     *        <p>
     *        Web proxy credentials are optional and you can use them to connect to a web proxy server that requires
     *        basic authentication. To store web proxy credentials, you use a secret in <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        setProxyConfiguration(proxyConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration information required to connect to websites using authentication.
     * </p>
     * <p>
     * You can connect to websites using basic authentication of user name and password.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You use a
     * secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets
     * Manager</a> to store your authentication credentials.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Provides configuration information required to connect to websites using authentication.</p>
     *        <p>
     *        You can connect to websites using basic authentication of user name and password.
     *        </p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You
     *        use a secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS
     *        Secrets Manager</a> to store your authentication credentials.
     */

    public void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * Provides configuration information required to connect to websites using authentication.
     * </p>
     * <p>
     * You can connect to websites using basic authentication of user name and password.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You use a
     * secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets
     * Manager</a> to store your authentication credentials.
     * </p>
     * 
     * @return Provides configuration information required to connect to websites using authentication.</p>
     *         <p>
     *         You can connect to websites using basic authentication of user name and password.
     *         </p>
     *         <p>
     *         You must provide the website host name and port number. For example, the host name of
     *         https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You
     *         use a secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS
     *         Secrets Manager</a> to store your authentication credentials.
     */

    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * Provides configuration information required to connect to websites using authentication.
     * </p>
     * <p>
     * You can connect to websites using basic authentication of user name and password.
     * </p>
     * <p>
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You use a
     * secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets
     * Manager</a> to store your authentication credentials.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Provides configuration information required to connect to websites using authentication.</p>
     *        <p>
     *        You can connect to websites using basic authentication of user name and password.
     *        </p>
     *        <p>
     *        You must provide the website host name and port number. For example, the host name of
     *        https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. You
     *        use a secret in <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS
     *        Secrets Manager</a> to store your authentication credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebCrawlerConfiguration withAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls()).append(",");
        if (getCrawlDepth() != null)
            sb.append("CrawlDepth: ").append(getCrawlDepth()).append(",");
        if (getMaxLinksPerPage() != null)
            sb.append("MaxLinksPerPage: ").append(getMaxLinksPerPage()).append(",");
        if (getMaxContentSizePerPageInMegaBytes() != null)
            sb.append("MaxContentSizePerPageInMegaBytes: ").append(getMaxContentSizePerPageInMegaBytes()).append(",");
        if (getMaxUrlsPerMinuteCrawlRate() != null)
            sb.append("MaxUrlsPerMinuteCrawlRate: ").append(getMaxUrlsPerMinuteCrawlRate()).append(",");
        if (getUrlInclusionPatterns() != null)
            sb.append("UrlInclusionPatterns: ").append(getUrlInclusionPatterns()).append(",");
        if (getUrlExclusionPatterns() != null)
            sb.append("UrlExclusionPatterns: ").append(getUrlExclusionPatterns()).append(",");
        if (getProxyConfiguration() != null)
            sb.append("ProxyConfiguration: ").append(getProxyConfiguration()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebCrawlerConfiguration == false)
            return false;
        WebCrawlerConfiguration other = (WebCrawlerConfiguration) obj;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getCrawlDepth() == null ^ this.getCrawlDepth() == null)
            return false;
        if (other.getCrawlDepth() != null && other.getCrawlDepth().equals(this.getCrawlDepth()) == false)
            return false;
        if (other.getMaxLinksPerPage() == null ^ this.getMaxLinksPerPage() == null)
            return false;
        if (other.getMaxLinksPerPage() != null && other.getMaxLinksPerPage().equals(this.getMaxLinksPerPage()) == false)
            return false;
        if (other.getMaxContentSizePerPageInMegaBytes() == null ^ this.getMaxContentSizePerPageInMegaBytes() == null)
            return false;
        if (other.getMaxContentSizePerPageInMegaBytes() != null
                && other.getMaxContentSizePerPageInMegaBytes().equals(this.getMaxContentSizePerPageInMegaBytes()) == false)
            return false;
        if (other.getMaxUrlsPerMinuteCrawlRate() == null ^ this.getMaxUrlsPerMinuteCrawlRate() == null)
            return false;
        if (other.getMaxUrlsPerMinuteCrawlRate() != null && other.getMaxUrlsPerMinuteCrawlRate().equals(this.getMaxUrlsPerMinuteCrawlRate()) == false)
            return false;
        if (other.getUrlInclusionPatterns() == null ^ this.getUrlInclusionPatterns() == null)
            return false;
        if (other.getUrlInclusionPatterns() != null && other.getUrlInclusionPatterns().equals(this.getUrlInclusionPatterns()) == false)
            return false;
        if (other.getUrlExclusionPatterns() == null ^ this.getUrlExclusionPatterns() == null)
            return false;
        if (other.getUrlExclusionPatterns() != null && other.getUrlExclusionPatterns().equals(this.getUrlExclusionPatterns()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getCrawlDepth() == null) ? 0 : getCrawlDepth().hashCode());
        hashCode = prime * hashCode + ((getMaxLinksPerPage() == null) ? 0 : getMaxLinksPerPage().hashCode());
        hashCode = prime * hashCode + ((getMaxContentSizePerPageInMegaBytes() == null) ? 0 : getMaxContentSizePerPageInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getMaxUrlsPerMinuteCrawlRate() == null) ? 0 : getMaxUrlsPerMinuteCrawlRate().hashCode());
        hashCode = prime * hashCode + ((getUrlInclusionPatterns() == null) ? 0 : getUrlInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getUrlExclusionPatterns() == null) ? 0 : getUrlExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WebCrawlerConfiguration clone() {
        try {
            return (WebCrawlerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.WebCrawlerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
