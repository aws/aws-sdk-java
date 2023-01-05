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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteRecommendationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRecommendationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     */
    private String recommendationTemplateArn;

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *         characters. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecommendationTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for a recommendation template.
     */

    public void setRecommendationTemplateArn(String recommendationTemplateArn) {
        this.recommendationTemplateArn = recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a recommendation template.
     */

    public String getRecommendationTemplateArn() {
        return this.recommendationTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a recommendation template.
     * </p>
     * 
     * @param recommendationTemplateArn
     *        The Amazon Resource Name (ARN) for a recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecommendationTemplateRequest withRecommendationTemplateArn(String recommendationTemplateArn) {
        setRecommendationTemplateArn(recommendationTemplateArn);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRecommendationTemplateArn() != null)
            sb.append("RecommendationTemplateArn: ").append(getRecommendationTemplateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRecommendationTemplateRequest == false)
            return false;
        DeleteRecommendationTemplateRequest other = (DeleteRecommendationTemplateRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRecommendationTemplateArn() == null ^ this.getRecommendationTemplateArn() == null)
            return false;
        if (other.getRecommendationTemplateArn() != null && other.getRecommendationTemplateArn().equals(this.getRecommendationTemplateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTemplateArn() == null) ? 0 : getRecommendationTemplateArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRecommendationTemplateRequest clone() {
        return (DeleteRecommendationTemplateRequest) super.clone();
    }

}
