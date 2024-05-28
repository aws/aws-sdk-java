/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The request entry for Recommendation Resource exclusion. Each entry is a combination of Recommendation Resource ARN
 * and corresponding exclusion status
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/RecommendationResourceExclusion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationResourceExclusion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The exclusion status
     * </p>
     */
    private Boolean isExcluded;

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @return The ARN of the Recommendation Resource
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationResourceExclusion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The exclusion status
     * </p>
     * 
     * @param isExcluded
     *        The exclusion status
     */

    public void setIsExcluded(Boolean isExcluded) {
        this.isExcluded = isExcluded;
    }

    /**
     * <p>
     * The exclusion status
     * </p>
     * 
     * @return The exclusion status
     */

    public Boolean getIsExcluded() {
        return this.isExcluded;
    }

    /**
     * <p>
     * The exclusion status
     * </p>
     * 
     * @param isExcluded
     *        The exclusion status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationResourceExclusion withIsExcluded(Boolean isExcluded) {
        setIsExcluded(isExcluded);
        return this;
    }

    /**
     * <p>
     * The exclusion status
     * </p>
     * 
     * @return The exclusion status
     */

    public Boolean isExcluded() {
        return this.isExcluded;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getIsExcluded() != null)
            sb.append("IsExcluded: ").append(getIsExcluded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationResourceExclusion == false)
            return false;
        RecommendationResourceExclusion other = (RecommendationResourceExclusion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIsExcluded() == null ^ this.getIsExcluded() == null)
            return false;
        if (other.getIsExcluded() != null && other.getIsExcluded().equals(this.getIsExcluded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getIsExcluded() == null) ? 0 : getIsExcluded().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationResourceExclusion clone() {
        try {
            return (RecommendationResourceExclusion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.RecommendationResourceExclusionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
