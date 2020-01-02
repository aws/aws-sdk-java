/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACLForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWebACLForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web
     * ACL.
     * </p>
     */
    private WebACL webACL;

    /**
     * <p>
     * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web
     * ACL.
     * </p>
     * 
     * @param webACL
     *        The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a
     *        null Web ACL.
     */

    public void setWebACL(WebACL webACL) {
        this.webACL = webACL;
    }

    /**
     * <p>
     * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web
     * ACL.
     * </p>
     * 
     * @return The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a
     *         null Web ACL.
     */

    public WebACL getWebACL() {
        return this.webACL;
    }

    /**
     * <p>
     * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web
     * ACL.
     * </p>
     * 
     * @param webACL
     *        The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a
     *        null Web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebACLForResourceResult withWebACL(WebACL webACL) {
        setWebACL(webACL);
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
        if (getWebACL() != null)
            sb.append("WebACL: ").append(getWebACL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLForResourceResult == false)
            return false;
        GetWebACLForResourceResult other = (GetWebACLForResourceResult) obj;
        if (other.getWebACL() == null ^ this.getWebACL() == null)
            return false;
        if (other.getWebACL() != null && other.getWebACL().equals(this.getWebACL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACL() == null) ? 0 : getWebACL().hashCode());
        return hashCode;
    }

    @Override
    public GetWebACLForResourceResult clone() {
        try {
            return (GetWebACLForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
