/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ProvisionProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is optional if the product has a default
     * path, and is required if there is more than one path for the specified product.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS account and
     * cannot be updated after the product is provisioned.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     */
    private java.util.List<ProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * A list of tags to use as provisioning options.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;
    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     */
    private String provisionToken;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @return The provisioning artifact identifier for this product.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is optional if the product has a default
     * path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning. This value is optional if the product has a
     *        default path, and is required if there is more than one path for the specified product.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is optional if the product has a default
     * path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @return The identifier of the path for this product's provisioning. This value is optional if the product has a
     *         default path, and is required if there is more than one path for the specified product.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning. This value is optional if the product has a default
     * path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning. This value is optional if the product has a
     *        default path, and is required if there is more than one path for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS account and
     * cannot be updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS
     *        account and cannot be updated after the product is provisioned.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS account and
     * cannot be updated after the product is provisioned.
     * </p>
     * 
     * @return A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS
     *         account and cannot be updated after the product is provisioned.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS account and
     * cannot be updated after the product is provisioned.
     * </p>
     * 
     * @param provisionedProductName
     *        A user-friendly name to identify the ProvisionedProduct object. This value must be unique for the AWS
     *        account and cannot be updated after the product is provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @return Parameters specified by the administrator that are required for provisioning the product.
     */

    public java.util.List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     */

    public void setProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<ProvisioningParameter>(provisioningParameters);
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningParameters(ProvisioningParameter... provisioningParameters) {
        if (this.provisioningParameters == null) {
            setProvisioningParameters(new java.util.ArrayList<ProvisioningParameter>(provisioningParameters.length));
        }
        for (ProvisioningParameter ele : provisioningParameters) {
            this.provisioningParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for provisioning the product.
     * </p>
     * 
     * @param provisioningParameters
     *        Parameters specified by the administrator that are required for provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * A list of tags to use as provisioning options.
     * </p>
     * 
     * @return A list of tags to use as provisioning options.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to use as provisioning options.
     * </p>
     * 
     * @param tags
     *        A list of tags to use as provisioning options.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to use as provisioning options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to use as provisioning options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to use as provisioning options.
     * </p>
     * 
     * @param tags
     *        A list of tags to use as provisioning options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @return Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     */

    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationArns(java.util.Collection)} or {@link #withNotificationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withNotificationArns(String... notificationArns) {
        if (this.notificationArns == null) {
            setNotificationArns(new java.util.ArrayList<String>(notificationArns.length));
        }
        for (String ele : notificationArns) {
            this.notificationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * </p>
     * 
     * @param notificationArns
     *        Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @param provisionToken
     *        An idempotency token that uniquely identifies the provisioning request.
     */

    public void setProvisionToken(String provisionToken) {
        this.provisionToken = provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @return An idempotency token that uniquely identifies the provisioning request.
     */

    public String getProvisionToken() {
        return this.provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * 
     * @param provisionToken
     *        An idempotency token that uniquely identifies the provisioning request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductRequest withProvisionToken(String provisionToken) {
        setProvisionToken(provisionToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: " + getNotificationArns() + ",");
        if (getProvisionToken() != null)
            sb.append("ProvisionToken: " + getProvisionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionProductRequest == false)
            return false;
        ProvisionProductRequest other = (ProvisionProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getProvisionToken() == null ^ this.getProvisionToken() == null)
            return false;
        if (other.getProvisionToken() != null && other.getProvisionToken().equals(this.getProvisionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getProvisionToken() == null) ? 0 : getProvisionToken().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionProductRequest clone() {
        return (ProvisionProductRequest) super.clone();
    }
}
