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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/StartAppAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAppAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The name for the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name for the assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @return The name for the assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
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

    public StartAppAssessmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartAppAssessmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppAssessmentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAppAssessmentRequest == false)
            return false;
        StartAppAssessmentRequest other = (StartAppAssessmentRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartAppAssessmentRequest clone() {
        return (StartAppAssessmentRequest) super.clone();
    }

}
