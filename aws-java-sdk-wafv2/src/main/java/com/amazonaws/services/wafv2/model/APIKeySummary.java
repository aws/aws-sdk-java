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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for a single API key.
 * </p>
 * <p>
 * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets you
 * customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information about the
 * CAPTCHA JavaScript integration, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client application
 * integration</a> in the <i>WAF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/APIKeySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APIKeySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     */
    private java.util.List<String> tokenDomains;
    /**
     * <p>
     * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     * </p>
     */
    private String aPIKey;
    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * Internal value used by WAF to manage the key.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @return The token domains that are defined in this API key.
     */

    public java.util.List<String> getTokenDomains() {
        return tokenDomains;
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     */

    public void setTokenDomains(java.util.Collection<String> tokenDomains) {
        if (tokenDomains == null) {
            this.tokenDomains = null;
            return;
        }

        this.tokenDomains = new java.util.ArrayList<String>(tokenDomains);
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenDomains(java.util.Collection)} or {@link #withTokenDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIKeySummary withTokenDomains(String... tokenDomains) {
        if (this.tokenDomains == null) {
            setTokenDomains(new java.util.ArrayList<String>(tokenDomains.length));
        }
        for (String ele : tokenDomains) {
            this.tokenDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The token domains that are defined in this API key.
     * </p>
     * 
     * @param tokenDomains
     *        The token domains that are defined in this API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIKeySummary withTokenDomains(java.util.Collection<String> tokenDomains) {
        setTokenDomains(tokenDomains);
        return this;
    }

    /**
     * <p>
     * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     * </p>
     * 
     * @param aPIKey
     *        The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     */

    public void setAPIKey(String aPIKey) {
        this.aPIKey = aPIKey;
    }

    /**
     * <p>
     * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     * </p>
     * 
     * @return The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     */

    public String getAPIKey() {
        return this.aPIKey;
    }

    /**
     * <p>
     * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     * </p>
     * 
     * @param aPIKey
     *        The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIKeySummary withAPIKey(String aPIKey) {
        setAPIKey(aPIKey);
        return this;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the key was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @return The date and time that the key was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The date and time that the key was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The date and time that the key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIKeySummary withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * Internal value used by WAF to manage the key.
     * </p>
     * 
     * @param version
     *        Internal value used by WAF to manage the key.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * Internal value used by WAF to manage the key.
     * </p>
     * 
     * @return Internal value used by WAF to manage the key.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Internal value used by WAF to manage the key.
     * </p>
     * 
     * @param version
     *        Internal value used by WAF to manage the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIKeySummary withVersion(Integer version) {
        setVersion(version);
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
        if (getTokenDomains() != null)
            sb.append("TokenDomains: ").append(getTokenDomains()).append(",");
        if (getAPIKey() != null)
            sb.append("APIKey: ").append(getAPIKey()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APIKeySummary == false)
            return false;
        APIKeySummary other = (APIKeySummary) obj;
        if (other.getTokenDomains() == null ^ this.getTokenDomains() == null)
            return false;
        if (other.getTokenDomains() != null && other.getTokenDomains().equals(this.getTokenDomains()) == false)
            return false;
        if (other.getAPIKey() == null ^ this.getAPIKey() == null)
            return false;
        if (other.getAPIKey() != null && other.getAPIKey().equals(this.getAPIKey()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenDomains() == null) ? 0 : getTokenDomains().hashCode());
        hashCode = prime * hashCode + ((getAPIKey() == null) ? 0 : getAPIKey().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public APIKeySummary clone() {
        try {
            return (APIKeySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.APIKeySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
