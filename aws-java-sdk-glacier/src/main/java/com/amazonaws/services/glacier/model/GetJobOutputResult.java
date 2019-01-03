/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobOutputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job data, either archive data or inventory data.
     * </p>
     */
    private java.io.InputStream body;
    /**
     * <p>
     * The checksum of the data in the response. This header is returned only when retrieving the output for an archive
     * retrieval job. Furthermore, this header appears only under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You get the entire range of the archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have
     * an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the
     * x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     * archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB
     * (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * </ul>
     */
    private String checksum;
    /**
     * <p>
     * The HTTP response code for a job output request. The value depends on whether a range was specified in the
     * request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the
     * range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
     * </p>
     */
    private String contentRange;
    /**
     * <p>
     * Indicates the range units accepted. For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     * </p>
     */
    private String acceptRanges;
    /**
     * <p>
     * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the
     * Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the
     * job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the
     * Content-Type is application/json.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The description of an archive.
     * </p>
     */
    private String archiveDescription;

    /**
     * <p>
     * The job data, either archive data or inventory data.
     * </p>
     * 
     * @param body
     *        The job data, either archive data or inventory data.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * <p>
     * The job data, either archive data or inventory data.
     * </p>
     * 
     * @return The job data, either archive data or inventory data.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * <p>
     * The job data, either archive data or inventory data.
     * </p>
     * 
     * @param body
     *        The job data, either archive data or inventory data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The checksum of the data in the response. This header is returned only when retrieving the output for an archive
     * retrieval job. Furthermore, this header appears only under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You get the entire range of the archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have
     * an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the
     * x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     * archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB
     * (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * </ul>
     * 
     * @param checksum
     *        The checksum of the data in the response. This header is returned only when retrieving the output for an
     *        archive retrieval job. Furthermore, this header appears only under the following conditions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You get the entire range of the archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if
     *        you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then
     *        the x-amz-sha256-tree-hash is returned as a response header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     *        archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at
     *        3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     *        </p>
     *        </li>
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum of the data in the response. This header is returned only when retrieving the output for an archive
     * retrieval job. Furthermore, this header appears only under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You get the entire range of the archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have
     * an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the
     * x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     * archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB
     * (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The checksum of the data in the response. This header is returned only when retrieving the output for an
     *         archive retrieval job. Furthermore, this header appears only under the following conditions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You get the entire range of the archive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if
     *         you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then
     *         the x-amz-sha256-tree-hash is returned as a response header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     *         archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends
     *         at 3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     *         </p>
     *         </li>
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum of the data in the response. This header is returned only when retrieving the output for an archive
     * retrieval job. Furthermore, this header appears only under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You get the entire range of the archive.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have
     * an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the
     * x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * <li>
     * <p>
     * You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     * archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB
     * (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     * </p>
     * </li>
     * </ul>
     * 
     * @param checksum
     *        The checksum of the data in the response. This header is returned only when retrieving the output for an
     *        archive retrieval job. Furthermore, this header appears only under the following conditions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You get the entire range of the archive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if
     *        you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then
     *        the x-amz-sha256-tree-hash is returned as a response header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the
     *        archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at
     *        3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The HTTP response code for a job output request. The value depends on whether a range was specified in the
     * request.
     * </p>
     * 
     * @param status
     *        The HTTP response code for a job output request. The value depends on whether a range was specified in the
     *        request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP response code for a job output request. The value depends on whether a range was specified in the
     * request.
     * </p>
     * 
     * @return The HTTP response code for a job output request. The value depends on whether a range was specified in
     *         the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP response code for a job output request. The value depends on whether a range was specified in the
     * request.
     * </p>
     * 
     * @param status
     *        The HTTP response code for a job output request. The value depends on whether a range was specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the
     * range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
     * </p>
     * 
     * @param contentRange
     *        The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides
     *        the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB
     *        from 8 MB.
     */

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    /**
     * <p>
     * The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the
     * range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
     * </p>
     * 
     * @return The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response
     *         provides the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the
     *         first 1 MB from 8 MB.
     */

    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * <p>
     * The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the
     * range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
     * </p>
     * 
     * @param contentRange
     *        The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides
     *        the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB
     *        from 8 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withContentRange(String contentRange) {
        setContentRange(contentRange);
        return this;
    }

    /**
     * <p>
     * Indicates the range units accepted. For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     * </p>
     * 
     * @param acceptRanges
     *        Indicates the range units accepted. For more information, see <a
     *        href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     */

    public void setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
    }

    /**
     * <p>
     * Indicates the range units accepted. For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     * </p>
     * 
     * @return Indicates the range units accepted. For more information, see <a
     *         href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     */

    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * <p>
     * Indicates the range units accepted. For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     * </p>
     * 
     * @param acceptRanges
     *        Indicates the range units accepted. For more information, see <a
     *        href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">RFC2616</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withAcceptRanges(String acceptRanges) {
        setAcceptRanges(acceptRanges);
        return this;
    }

    /**
     * <p>
     * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the
     * Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the
     * job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the
     * Content-Type is application/json.
     * </p>
     * 
     * @param contentType
     *        The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data,
     *        the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you
     *        initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as
     *        JSON, and the Content-Type is application/json.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the
     * Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the
     * job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the
     * Content-Type is application/json.
     * </p>
     * 
     * @return The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data,
     *         the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you
     *         initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as
     *         JSON, and the Content-Type is application/json.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the
     * Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the
     * job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the
     * Content-Type is application/json.
     * </p>
     * 
     * @param contentType
     *        The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data,
     *        the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you
     *        initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as
     *        JSON, and the Content-Type is application/json.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The description of an archive.
     * </p>
     * 
     * @param archiveDescription
     *        The description of an archive.
     */

    public void setArchiveDescription(String archiveDescription) {
        this.archiveDescription = archiveDescription;
    }

    /**
     * <p>
     * The description of an archive.
     * </p>
     * 
     * @return The description of an archive.
     */

    public String getArchiveDescription() {
        return this.archiveDescription;
    }

    /**
     * <p>
     * The description of an archive.
     * </p>
     * 
     * @param archiveDescription
     *        The description of an archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobOutputResult withArchiveDescription(String archiveDescription) {
        setArchiveDescription(archiveDescription);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getContentRange() != null)
            sb.append("ContentRange: ").append(getContentRange()).append(",");
        if (getAcceptRanges() != null)
            sb.append("AcceptRanges: ").append(getAcceptRanges()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getArchiveDescription() != null)
            sb.append("ArchiveDescription: ").append(getArchiveDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobOutputResult == false)
            return false;
        GetJobOutputResult other = (GetJobOutputResult) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getContentRange() == null ^ this.getContentRange() == null)
            return false;
        if (other.getContentRange() != null && other.getContentRange().equals(this.getContentRange()) == false)
            return false;
        if (other.getAcceptRanges() == null ^ this.getAcceptRanges() == null)
            return false;
        if (other.getAcceptRanges() != null && other.getAcceptRanges().equals(this.getAcceptRanges()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getArchiveDescription() == null ^ this.getArchiveDescription() == null)
            return false;
        if (other.getArchiveDescription() != null && other.getArchiveDescription().equals(this.getArchiveDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getContentRange() == null) ? 0 : getContentRange().hashCode());
        hashCode = prime * hashCode + ((getAcceptRanges() == null) ? 0 : getAcceptRanges().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getArchiveDescription() == null) ? 0 : getArchiveDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetJobOutputResult clone() {
        try {
            return (GetJobOutputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
