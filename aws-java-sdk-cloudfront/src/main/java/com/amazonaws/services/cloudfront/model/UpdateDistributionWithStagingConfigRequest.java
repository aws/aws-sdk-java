/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistributionWithStagingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDistributionWithStagingConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the primary distribution to which you are copying a staging distribution's configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the staging distribution whose configuration you are copying to the primary distribution.
     * </p>
     */
    private String stagingDistributionId;
    /**
     * <p>
     * The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these in the
     * following format:
     * </p>
     * <p>
     * <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * The identifier of the primary distribution to which you are copying a staging distribution's configuration.
     * </p>
     * 
     * @param id
     *        The identifier of the primary distribution to which you are copying a staging distribution's
     *        configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the primary distribution to which you are copying a staging distribution's configuration.
     * </p>
     * 
     * @return The identifier of the primary distribution to which you are copying a staging distribution's
     *         configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the primary distribution to which you are copying a staging distribution's configuration.
     * </p>
     * 
     * @param id
     *        The identifier of the primary distribution to which you are copying a staging distribution's
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionWithStagingConfigRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the staging distribution whose configuration you are copying to the primary distribution.
     * </p>
     * 
     * @param stagingDistributionId
     *        The identifier of the staging distribution whose configuration you are copying to the primary
     *        distribution.
     */

    public void setStagingDistributionId(String stagingDistributionId) {
        this.stagingDistributionId = stagingDistributionId;
    }

    /**
     * <p>
     * The identifier of the staging distribution whose configuration you are copying to the primary distribution.
     * </p>
     * 
     * @return The identifier of the staging distribution whose configuration you are copying to the primary
     *         distribution.
     */

    public String getStagingDistributionId() {
        return this.stagingDistributionId;
    }

    /**
     * <p>
     * The identifier of the staging distribution whose configuration you are copying to the primary distribution.
     * </p>
     * 
     * @param stagingDistributionId
     *        The identifier of the staging distribution whose configuration you are copying to the primary
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionWithStagingConfigRequest withStagingDistributionId(String stagingDistributionId) {
        setStagingDistributionId(stagingDistributionId);
        return this;
    }

    /**
     * <p>
     * The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these in the
     * following format:
     * </p>
     * <p>
     * <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     * </p>
     * 
     * @param ifMatch
     *        The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these
     *        in the following format:</p>
     *        <p>
     *        <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these in the
     * following format:
     * </p>
     * <p>
     * <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     * </p>
     * 
     * @return The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these
     *         in the following format:</p>
     *         <p>
     *         <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these in the
     * following format:
     * </p>
     * <p>
     * <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     * </p>
     * 
     * @param ifMatch
     *        The current versions (<code>ETag</code> values) of both primary and staging distributions. Provide these
     *        in the following format:</p>
     *        <p>
     *        <code>&lt;primary ETag&gt;, &lt;staging ETag&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionWithStagingConfigRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStagingDistributionId() != null)
            sb.append("StagingDistributionId: ").append(getStagingDistributionId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDistributionWithStagingConfigRequest == false)
            return false;
        UpdateDistributionWithStagingConfigRequest other = (UpdateDistributionWithStagingConfigRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStagingDistributionId() == null ^ this.getStagingDistributionId() == null)
            return false;
        if (other.getStagingDistributionId() != null && other.getStagingDistributionId().equals(this.getStagingDistributionId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStagingDistributionId() == null) ? 0 : getStagingDistributionId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionWithStagingConfigRequest clone() {
        return (UpdateDistributionWithStagingConfigRequest) super.clone();
    }

}
