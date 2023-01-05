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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableApplicationLayerAutomaticResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableApplicationLayerAutomaticResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the protected resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the
     * protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic
     * application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced
     * creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with
     * the resource.
     * </p>
     */
    private ResponseAction action;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the protected resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the protected resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the protected resource.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the protected resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the protected resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the protected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableApplicationLayerAutomaticResponseRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the
     * protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic
     * application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced
     * creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with
     * the resource.
     * </p>
     * 
     * @param action
     *        Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of
     *        the protected resource in response to DDoS attacks. You specify this as part of the configuration for the
     *        automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation.
     *        Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you
     *        have associated with the resource.
     */

    public void setAction(ResponseAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the
     * protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic
     * application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced
     * creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with
     * the resource.
     * </p>
     * 
     * @return Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf
     *         of the protected resource in response to DDoS attacks. You specify this as part of the configuration for
     *         the automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation.
     *         Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that
     *         you have associated with the resource.
     */

    public ResponseAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the
     * protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic
     * application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced
     * creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with
     * the resource.
     * </p>
     * 
     * @param action
     *        Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of
     *        the protected resource in response to DDoS attacks. You specify this as part of the configuration for the
     *        automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation.
     *        Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you
     *        have associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableApplicationLayerAutomaticResponseRequest withAction(ResponseAction action) {
        setAction(action);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableApplicationLayerAutomaticResponseRequest == false)
            return false;
        EnableApplicationLayerAutomaticResponseRequest other = (EnableApplicationLayerAutomaticResponseRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public EnableApplicationLayerAutomaticResponseRequest clone() {
        return (EnableApplicationLayerAutomaticResponseRequest) super.clone();
    }

}
