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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAccessPreview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPreviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     */
    private String accessPreviewId;
    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access preview.
     * </p>
     */
    private String analyzerArn;

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param accessPreviewId
     *        The unique ID for the access preview.
     */

    public void setAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @return The unique ID for the access preview.
     */

    public String getAccessPreviewId() {
        return this.accessPreviewId;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param accessPreviewId
     *        The unique ID for the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPreviewRequest withAccessPreviewId(String accessPreviewId) {
        setAccessPreviewId(accessPreviewId);
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the analyzer</a> used to generate the access preview.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access preview.
     * </p>
     * 
     * @return The <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *         >ARN of the analyzer</a> used to generate the access preview.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the analyzer</a> used to generate the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPreviewRequest withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
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
        if (getAccessPreviewId() != null)
            sb.append("AccessPreviewId: ").append(getAccessPreviewId()).append(",");
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessPreviewRequest == false)
            return false;
        GetAccessPreviewRequest other = (GetAccessPreviewRequest) obj;
        if (other.getAccessPreviewId() == null ^ this.getAccessPreviewId() == null)
            return false;
        if (other.getAccessPreviewId() != null && other.getAccessPreviewId().equals(this.getAccessPreviewId()) == false)
            return false;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPreviewId() == null) ? 0 : getAccessPreviewId().hashCode());
        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPreviewRequest clone() {
        return (GetAccessPreviewRequest) super.clone();
    }

}
