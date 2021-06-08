/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAccessPreview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPreviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the account analyzer</a> used to generate the access preview. You can only create an access preview for
     * analyzers with an <code>Account</code> type and <code>Active</code> status.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Access control configuration for your resource that is used to generate the access preview. The access preview
     * includes findings for external access allowed to the resource with the proposed access control configuration. The
     * configuration must contain exactly one element.
     * </p>
     */
    private java.util.Map<String, Configuration> configurations;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the account analyzer</a> used to generate the access preview. You can only create an access preview for
     * analyzers with an <code>Account</code> type and <code>Active</code> status.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the account analyzer</a> used to generate the access preview. You can only create an access
     *        preview for analyzers with an <code>Account</code> type and <code>Active</code> status.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the account analyzer</a> used to generate the access preview. You can only create an access preview for
     * analyzers with an <code>Account</code> type and <code>Active</code> status.
     * </p>
     * 
     * @return The <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *         >ARN of the account analyzer</a> used to generate the access preview. You can only create an access
     *         preview for analyzers with an <code>Account</code> type and <code>Active</code> status.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the account analyzer</a> used to generate the access preview. You can only create an access preview for
     * analyzers with an <code>Account</code> type and <code>Active</code> status.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the account analyzer</a> used to generate the access preview. You can only create an access
     *        preview for analyzers with an <code>Account</code> type and <code>Active</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPreviewRequest withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @return A client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPreviewRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Access control configuration for your resource that is used to generate the access preview. The access preview
     * includes findings for external access allowed to the resource with the proposed access control configuration. The
     * configuration must contain exactly one element.
     * </p>
     * 
     * @return Access control configuration for your resource that is used to generate the access preview. The access
     *         preview includes findings for external access allowed to the resource with the proposed access control
     *         configuration. The configuration must contain exactly one element.
     */

    public java.util.Map<String, Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Access control configuration for your resource that is used to generate the access preview. The access preview
     * includes findings for external access allowed to the resource with the proposed access control configuration. The
     * configuration must contain exactly one element.
     * </p>
     * 
     * @param configurations
     *        Access control configuration for your resource that is used to generate the access preview. The access
     *        preview includes findings for external access allowed to the resource with the proposed access control
     *        configuration. The configuration must contain exactly one element.
     */

    public void setConfigurations(java.util.Map<String, Configuration> configurations) {
        this.configurations = configurations;
    }

    /**
     * <p>
     * Access control configuration for your resource that is used to generate the access preview. The access preview
     * includes findings for external access allowed to the resource with the proposed access control configuration. The
     * configuration must contain exactly one element.
     * </p>
     * 
     * @param configurations
     *        Access control configuration for your resource that is used to generate the access preview. The access
     *        preview includes findings for external access allowed to the resource with the proposed access control
     *        configuration. The configuration must contain exactly one element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPreviewRequest withConfigurations(java.util.Map<String, Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * Add a single Configurations entry
     *
     * @see CreateAccessPreviewRequest#withConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPreviewRequest addConfigurationsEntry(String key, Configuration value) {
        if (null == this.configurations) {
            this.configurations = new java.util.HashMap<String, Configuration>();
        }
        if (this.configurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPreviewRequest clearConfigurationsEntries() {
        this.configurations = null;
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
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPreviewRequest == false)
            return false;
        CreateAccessPreviewRequest other = (CreateAccessPreviewRequest) obj;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPreviewRequest clone() {
        return (CreateAccessPreviewRequest) super.clone();
    }

}
