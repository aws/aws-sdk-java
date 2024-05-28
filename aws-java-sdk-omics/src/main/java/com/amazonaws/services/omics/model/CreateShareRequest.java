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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource to be shared.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The principal subscriber is the account being offered shared access to the resource.
     * </p>
     */
    private String principalSubscriber;
    /**
     * <p>
     * A name that the owner defines for the share.
     * </p>
     */
    private String shareName;

    /**
     * <p>
     * The ARN of the resource to be shared.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource to be shared.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to be shared.
     * </p>
     * 
     * @return The ARN of the resource to be shared.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to be shared.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource to be shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateShareRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The principal subscriber is the account being offered shared access to the resource.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account being offered shared access to the resource.
     */

    public void setPrincipalSubscriber(String principalSubscriber) {
        this.principalSubscriber = principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account being offered shared access to the resource.
     * </p>
     * 
     * @return The principal subscriber is the account being offered shared access to the resource.
     */

    public String getPrincipalSubscriber() {
        return this.principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account being offered shared access to the resource.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account being offered shared access to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateShareRequest withPrincipalSubscriber(String principalSubscriber) {
        setPrincipalSubscriber(principalSubscriber);
        return this;
    }

    /**
     * <p>
     * A name that the owner defines for the share.
     * </p>
     * 
     * @param shareName
     *        A name that the owner defines for the share.
     */

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * <p>
     * A name that the owner defines for the share.
     * </p>
     * 
     * @return A name that the owner defines for the share.
     */

    public String getShareName() {
        return this.shareName;
    }

    /**
     * <p>
     * A name that the owner defines for the share.
     * </p>
     * 
     * @param shareName
     *        A name that the owner defines for the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateShareRequest withShareName(String shareName) {
        setShareName(shareName);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPrincipalSubscriber() != null)
            sb.append("PrincipalSubscriber: ").append(getPrincipalSubscriber()).append(",");
        if (getShareName() != null)
            sb.append("ShareName: ").append(getShareName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateShareRequest == false)
            return false;
        CreateShareRequest other = (CreateShareRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipalSubscriber() == null ^ this.getPrincipalSubscriber() == null)
            return false;
        if (other.getPrincipalSubscriber() != null && other.getPrincipalSubscriber().equals(this.getPrincipalSubscriber()) == false)
            return false;
        if (other.getShareName() == null ^ this.getShareName() == null)
            return false;
        if (other.getShareName() != null && other.getShareName().equals(this.getShareName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalSubscriber() == null) ? 0 : getPrincipalSubscriber().hashCode());
        hashCode = prime * hashCode + ((getShareName() == null) ? 0 : getShareName().hashCode());
        return hashCode;
    }

    @Override
    public CreateShareRequest clone() {
        return (CreateShareRequest) super.clone();
    }

}
