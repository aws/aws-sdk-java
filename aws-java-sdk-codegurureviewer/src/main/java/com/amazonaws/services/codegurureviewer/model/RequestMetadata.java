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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata that is associated with a code review. This applies to both pull request and repository analysis code
 * reviews.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RequestMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the request. This is required for a pull request code review.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * An identifier, such as a name or account ID, that is associated with the requester. The <code>Requester</code> is
     * used to capture the <code>author/actor</code> name of the event request.
     * </p>
     */
    private String requester;
    /**
     * <p>
     * Information about the event associated with a code review.
     * </p>
     */
    private EventInfo eventInfo;
    /**
     * <p>
     * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if
     * code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub
     * repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code> and the CI/CD
     * repository vendor name is GitHub. For more information, see the definition for <code>ProviderType</code> in <a
     * href
     * ="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">RepositoryAssociation
     * </a>.
     * </p>
     */
    private String vendorName;

    /**
     * <p>
     * The ID of the request. This is required for a pull request code review.
     * </p>
     * 
     * @param requestId
     *        The ID of the request. This is required for a pull request code review.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the request. This is required for a pull request code review.
     * </p>
     * 
     * @return The ID of the request. This is required for a pull request code review.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the request. This is required for a pull request code review.
     * </p>
     * 
     * @param requestId
     *        The ID of the request. This is required for a pull request code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestMetadata withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * An identifier, such as a name or account ID, that is associated with the requester. The <code>Requester</code> is
     * used to capture the <code>author/actor</code> name of the event request.
     * </p>
     * 
     * @param requester
     *        An identifier, such as a name or account ID, that is associated with the requester. The
     *        <code>Requester</code> is used to capture the <code>author/actor</code> name of the event request.
     */

    public void setRequester(String requester) {
        this.requester = requester;
    }

    /**
     * <p>
     * An identifier, such as a name or account ID, that is associated with the requester. The <code>Requester</code> is
     * used to capture the <code>author/actor</code> name of the event request.
     * </p>
     * 
     * @return An identifier, such as a name or account ID, that is associated with the requester. The
     *         <code>Requester</code> is used to capture the <code>author/actor</code> name of the event request.
     */

    public String getRequester() {
        return this.requester;
    }

    /**
     * <p>
     * An identifier, such as a name or account ID, that is associated with the requester. The <code>Requester</code> is
     * used to capture the <code>author/actor</code> name of the event request.
     * </p>
     * 
     * @param requester
     *        An identifier, such as a name or account ID, that is associated with the requester. The
     *        <code>Requester</code> is used to capture the <code>author/actor</code> name of the event request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestMetadata withRequester(String requester) {
        setRequester(requester);
        return this;
    }

    /**
     * <p>
     * Information about the event associated with a code review.
     * </p>
     * 
     * @param eventInfo
     *        Information about the event associated with a code review.
     */

    public void setEventInfo(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    /**
     * <p>
     * Information about the event associated with a code review.
     * </p>
     * 
     * @return Information about the event associated with a code review.
     */

    public EventInfo getEventInfo() {
        return this.eventInfo;
    }

    /**
     * <p>
     * Information about the event associated with a code review.
     * </p>
     * 
     * @param eventInfo
     *        Information about the event associated with a code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestMetadata withEventInfo(EventInfo eventInfo) {
        setEventInfo(eventInfo);
        return this;
    }

    /**
     * <p>
     * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if
     * code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub
     * repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code> and the CI/CD
     * repository vendor name is GitHub. For more information, see the definition for <code>ProviderType</code> in <a
     * href
     * ="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">RepositoryAssociation
     * </a>.
     * </p>
     * 
     * @param vendorName
     *        The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For
     *        example, if code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from
     *        a GitHub repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code>
     *        and the CI/CD repository vendor name is GitHub. For more information, see the definition for
     *        <code>ProviderType</code> in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html"
     *        >RepositoryAssociation</a>.
     * @see VendorName
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if
     * code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub
     * repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code> and the CI/CD
     * repository vendor name is GitHub. For more information, see the definition for <code>ProviderType</code> in <a
     * href
     * ="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">RepositoryAssociation
     * </a>.
     * </p>
     * 
     * @return The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For
     *         example, if code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts
     *         from a GitHub repository, then the repository association's <code>ProviderType</code> is
     *         <code>S3Bucket</code> and the CI/CD repository vendor name is GitHub. For more information, see the
     *         definition for <code>ProviderType</code> in <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html"
     *         >RepositoryAssociation</a>.
     * @see VendorName
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if
     * code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub
     * repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code> and the CI/CD
     * repository vendor name is GitHub. For more information, see the definition for <code>ProviderType</code> in <a
     * href
     * ="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">RepositoryAssociation
     * </a>.
     * </p>
     * 
     * @param vendorName
     *        The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For
     *        example, if code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from
     *        a GitHub repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code>
     *        and the CI/CD repository vendor name is GitHub. For more information, see the definition for
     *        <code>ProviderType</code> in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html"
     *        >RepositoryAssociation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorName
     */

    public RequestMetadata withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if
     * code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub
     * repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code> and the CI/CD
     * repository vendor name is GitHub. For more information, see the definition for <code>ProviderType</code> in <a
     * href
     * ="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">RepositoryAssociation
     * </a>.
     * </p>
     * 
     * @param vendorName
     *        The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For
     *        example, if code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from
     *        a GitHub repository, then the repository association's <code>ProviderType</code> is <code>S3Bucket</code>
     *        and the CI/CD repository vendor name is GitHub. For more information, see the definition for
     *        <code>ProviderType</code> in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html"
     *        >RepositoryAssociation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorName
     */

    public RequestMetadata withVendorName(VendorName vendorName) {
        this.vendorName = vendorName.toString();
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getRequester() != null)
            sb.append("Requester: ").append(getRequester()).append(",");
        if (getEventInfo() != null)
            sb.append("EventInfo: ").append(getEventInfo()).append(",");
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestMetadata == false)
            return false;
        RequestMetadata other = (RequestMetadata) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRequester() == null ^ this.getRequester() == null)
            return false;
        if (other.getRequester() != null && other.getRequester().equals(this.getRequester()) == false)
            return false;
        if (other.getEventInfo() == null ^ this.getEventInfo() == null)
            return false;
        if (other.getEventInfo() != null && other.getEventInfo().equals(this.getEventInfo()) == false)
            return false;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRequester() == null) ? 0 : getRequester().hashCode());
        hashCode = prime * hashCode + ((getEventInfo() == null) ? 0 : getEventInfo().hashCode());
        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        return hashCode;
    }

    @Override
    public RequestMetadata clone() {
        try {
            return (RequestMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RequestMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
