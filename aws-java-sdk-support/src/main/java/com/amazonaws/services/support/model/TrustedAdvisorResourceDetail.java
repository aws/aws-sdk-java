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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a resource identified by a Trusted Advisor check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorResourceDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorResourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the
     * user.
     * </p>
     */
    private Boolean isSuppressed;
    /**
     * <p>
     * Additional information about the identified resource. The exact metadata and its order can be obtained by
     * inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel download,
     * even in those cases where the UI shows just summary data.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> metadata;

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     * 
     * @param status
     *        The status code for the resource identified in the Trusted Advisor check.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     * 
     * @return The status code for the resource identified in the Trusted Advisor check.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     * 
     * @param status
     *        The status code for the resource identified in the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     * 
     * @param region
     *        The AWS region in which the identified resource is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     * 
     * @return The AWS region in which the identified resource is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     * 
     * @param region
     *        The AWS region in which the identified resource is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the identified resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     * 
     * @return The unique identifier for the identified resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the identified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the
     * user.
     * </p>
     * 
     * @param isSuppressed
     *        Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by
     *        the user.
     */

    public void setIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the
     * user.
     * </p>
     * 
     * @return Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by
     *         the user.
     */

    public Boolean getIsSuppressed() {
        return this.isSuppressed;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the
     * user.
     * </p>
     * 
     * @param isSuppressed
     *        Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by
     *        the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withIsSuppressed(Boolean isSuppressed) {
        setIsSuppressed(isSuppressed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the
     * user.
     * </p>
     * 
     * @return Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by
     *         the user.
     */

    public Boolean isSuppressed() {
        return this.isSuppressed;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata and its order can be obtained by
     * inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel download,
     * even in those cases where the UI shows just summary data.
     * </p>
     * 
     * @return Additional information about the identified resource. The exact metadata and its order can be obtained by
     *         inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     *         <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel
     *         download, even in those cases where the UI shows just summary data.
     */

    public java.util.List<String> getMetadata() {
        if (metadata == null) {
            metadata = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metadata;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata and its order can be obtained by
     * inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel download,
     * even in those cases where the UI shows just summary data.
     * </p>
     * 
     * @param metadata
     *        Additional information about the identified resource. The exact metadata and its order can be obtained by
     *        inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     *        <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel
     *        download, even in those cases where the UI shows just summary data.
     */

    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new com.amazonaws.internal.SdkInternalList<String>(metadata);
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata and its order can be obtained by
     * inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel download,
     * even in those cases where the UI shows just summary data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadata(java.util.Collection)} or {@link #withMetadata(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metadata
     *        Additional information about the identified resource. The exact metadata and its order can be obtained by
     *        inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     *        <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel
     *        download, even in those cases where the UI shows just summary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withMetadata(String... metadata) {
        if (this.metadata == null) {
            setMetadata(new com.amazonaws.internal.SdkInternalList<String>(metadata.length));
        }
        for (String ele : metadata) {
            this.metadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata and its order can be obtained by
     * inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel download,
     * even in those cases where the UI shows just summary data.
     * </p>
     * 
     * @param metadata
     *        Additional information about the identified resource. The exact metadata and its order can be obtained by
     *        inspecting the <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     *        <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the data that is shown in the Excel
     *        download, even in those cases where the UI shows just summary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorResourceDetail withMetadata(java.util.Collection<String> metadata) {
        setMetadata(metadata);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getIsSuppressed() != null)
            sb.append("IsSuppressed: ").append(getIsSuppressed()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorResourceDetail == false)
            return false;
        TrustedAdvisorResourceDetail other = (TrustedAdvisorResourceDetail) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getIsSuppressed() == null ^ this.getIsSuppressed() == null)
            return false;
        if (other.getIsSuppressed() != null && other.getIsSuppressed().equals(this.getIsSuppressed()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getIsSuppressed() == null) ? 0 : getIsSuppressed().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorResourceDetail clone() {
        try {
            return (TrustedAdvisorResourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorResourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
