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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Campaign hook information.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignHook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignHook implements Serializable, Cloneable, StructuredPojo {

    /** Lambda function name or arn to be called for delivery */
    private String lambdaFunctionName;
    /** What mode Lambda should be invoked in. */
    private String mode;
    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the
     * request
     */
    private String webUrl;

    /**
     * Lambda function name or arn to be called for delivery
     * 
     * @param lambdaFunctionName
     *        Lambda function name or arn to be called for delivery
     */

    public void setLambdaFunctionName(String lambdaFunctionName) {
        this.lambdaFunctionName = lambdaFunctionName;
    }

    /**
     * Lambda function name or arn to be called for delivery
     * 
     * @return Lambda function name or arn to be called for delivery
     */

    public String getLambdaFunctionName() {
        return this.lambdaFunctionName;
    }

    /**
     * Lambda function name or arn to be called for delivery
     * 
     * @param lambdaFunctionName
     *        Lambda function name or arn to be called for delivery
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignHook withLambdaFunctionName(String lambdaFunctionName) {
        setLambdaFunctionName(lambdaFunctionName);
        return this;
    }

    /**
     * What mode Lambda should be invoked in.
     * 
     * @param mode
     *        What mode Lambda should be invoked in.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * What mode Lambda should be invoked in.
     * 
     * @return What mode Lambda should be invoked in.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * What mode Lambda should be invoked in.
     * 
     * @param mode
     *        What mode Lambda should be invoked in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public CampaignHook withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * What mode Lambda should be invoked in.
     * 
     * @param mode
     *        What mode Lambda should be invoked in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public CampaignHook withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the
     * request
     * 
     * @param webUrl
     *        Web URL to call for hook. If the URL has authentication specified it will be added as authentication to
     *        the request
     */

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the
     * request
     * 
     * @return Web URL to call for hook. If the URL has authentication specified it will be added as authentication to
     *         the request
     */

    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the
     * request
     * 
     * @param webUrl
     *        Web URL to call for hook. If the URL has authentication specified it will be added as authentication to
     *        the request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignHook withWebUrl(String webUrl) {
        setWebUrl(webUrl);
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
        if (getLambdaFunctionName() != null)
            sb.append("LambdaFunctionName: ").append(getLambdaFunctionName()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getWebUrl() != null)
            sb.append("WebUrl: ").append(getWebUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignHook == false)
            return false;
        CampaignHook other = (CampaignHook) obj;
        if (other.getLambdaFunctionName() == null ^ this.getLambdaFunctionName() == null)
            return false;
        if (other.getLambdaFunctionName() != null && other.getLambdaFunctionName().equals(this.getLambdaFunctionName()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getWebUrl() == null ^ this.getWebUrl() == null)
            return false;
        if (other.getWebUrl() != null && other.getWebUrl().equals(this.getWebUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaFunctionName() == null) ? 0 : getLambdaFunctionName().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getWebUrl() == null) ? 0 : getWebUrl().hashCode());
        return hashCode;
    }

    @Override
    public CampaignHook clone() {
        try {
            return (CampaignHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignHookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
