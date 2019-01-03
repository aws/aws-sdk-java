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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to update a distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateDistribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     */
    private DistributionConfig distributionConfig;
    /**
     * <p>
     * The distribution's id.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the distribution's configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * Default constructor for UpdateDistributionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UpdateDistributionRequest() {
    }

    /**
     * Constructs a new UpdateDistributionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     * @param id
     *        The distribution's id.
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when retrieving the distribution's
     *        configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     */
    public UpdateDistributionRequest(DistributionConfig distributionConfig, String id, String ifMatch) {
        setDistributionConfig(distributionConfig);
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * 
     * @return The distribution's configuration information.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withDistributionConfig(DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
        return this;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @param id
     *        The distribution's id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @return The distribution's id.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * 
     * @param id
     *        The distribution's id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the distribution's configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when retrieving the distribution's
     *        configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the distribution's configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The value of the <code>ETag</code> header that you received when retrieving the distribution's
     *         configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the distribution's configuration. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when retrieving the distribution's
     *        configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionRequest withIfMatch(String ifMatch) {
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
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: ").append(getDistributionConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof UpdateDistributionRequest == false)
            return false;
        UpdateDistributionRequest other = (UpdateDistributionRequest) obj;
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionRequest clone() {
        return (UpdateDistributionRequest) super.clone();
    }

}
