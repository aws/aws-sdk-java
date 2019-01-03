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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the application associated with the Amazon CloudFormation template.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Format for generating the Amazon CloudFormation template.
     * </p>
     */
    private String templateFormat;

    /**
     * <p>
     * ID of the application associated with the Amazon CloudFormation template.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the Amazon CloudFormation template.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * ID of the application associated with the Amazon CloudFormation template.
     * </p>
     * 
     * @return ID of the application associated with the Amazon CloudFormation template.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * ID of the application associated with the Amazon CloudFormation template.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the Amazon CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateTemplateRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Format for generating the Amazon CloudFormation template.
     * </p>
     * 
     * @param templateFormat
     *        Format for generating the Amazon CloudFormation template.
     * @see OutputFormat
     */

    public void setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
    }

    /**
     * <p>
     * Format for generating the Amazon CloudFormation template.
     * </p>
     * 
     * @return Format for generating the Amazon CloudFormation template.
     * @see OutputFormat
     */

    public String getTemplateFormat() {
        return this.templateFormat;
    }

    /**
     * <p>
     * Format for generating the Amazon CloudFormation template.
     * </p>
     * 
     * @param templateFormat
     *        Format for generating the Amazon CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public GenerateTemplateRequest withTemplateFormat(String templateFormat) {
        setTemplateFormat(templateFormat);
        return this;
    }

    /**
     * <p>
     * Format for generating the Amazon CloudFormation template.
     * </p>
     * 
     * @param templateFormat
     *        Format for generating the Amazon CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public GenerateTemplateRequest withTemplateFormat(OutputFormat templateFormat) {
        this.templateFormat = templateFormat.toString();
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getTemplateFormat() != null)
            sb.append("TemplateFormat: ").append(getTemplateFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateTemplateRequest == false)
            return false;
        GenerateTemplateRequest other = (GenerateTemplateRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getTemplateFormat() == null ^ this.getTemplateFormat() == null)
            return false;
        if (other.getTemplateFormat() != null && other.getTemplateFormat().equals(this.getTemplateFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getTemplateFormat() == null) ? 0 : getTemplateFormat().hashCode());
        return hashCode;
    }

    @Override
    public GenerateTemplateRequest clone() {
        return (GenerateTemplateRequest) super.clone();
    }

}
