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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * A list of items with error details about each item, which could not be included or excluded.
     * </p>
     */
    private java.util.List<BatchUpdateRecommendationStatusFailedEntry> failedEntries;
    /**
     * <p>
     * A list of items that were included or excluded.
     * </p>
     */
    private java.util.List<BatchUpdateRecommendationStatusSuccessfulEntry> successfulEntries;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusResult withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * A list of items with error details about each item, which could not be included or excluded.
     * </p>
     * 
     * @return A list of items with error details about each item, which could not be included or excluded.
     */

    public java.util.List<BatchUpdateRecommendationStatusFailedEntry> getFailedEntries() {
        return failedEntries;
    }

    /**
     * <p>
     * A list of items with error details about each item, which could not be included or excluded.
     * </p>
     * 
     * @param failedEntries
     *        A list of items with error details about each item, which could not be included or excluded.
     */

    public void setFailedEntries(java.util.Collection<BatchUpdateRecommendationStatusFailedEntry> failedEntries) {
        if (failedEntries == null) {
            this.failedEntries = null;
            return;
        }

        this.failedEntries = new java.util.ArrayList<BatchUpdateRecommendationStatusFailedEntry>(failedEntries);
    }

    /**
     * <p>
     * A list of items with error details about each item, which could not be included or excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedEntries(java.util.Collection)} or {@link #withFailedEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedEntries
     *        A list of items with error details about each item, which could not be included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusResult withFailedEntries(BatchUpdateRecommendationStatusFailedEntry... failedEntries) {
        if (this.failedEntries == null) {
            setFailedEntries(new java.util.ArrayList<BatchUpdateRecommendationStatusFailedEntry>(failedEntries.length));
        }
        for (BatchUpdateRecommendationStatusFailedEntry ele : failedEntries) {
            this.failedEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of items with error details about each item, which could not be included or excluded.
     * </p>
     * 
     * @param failedEntries
     *        A list of items with error details about each item, which could not be included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusResult withFailedEntries(java.util.Collection<BatchUpdateRecommendationStatusFailedEntry> failedEntries) {
        setFailedEntries(failedEntries);
        return this;
    }

    /**
     * <p>
     * A list of items that were included or excluded.
     * </p>
     * 
     * @return A list of items that were included or excluded.
     */

    public java.util.List<BatchUpdateRecommendationStatusSuccessfulEntry> getSuccessfulEntries() {
        return successfulEntries;
    }

    /**
     * <p>
     * A list of items that were included or excluded.
     * </p>
     * 
     * @param successfulEntries
     *        A list of items that were included or excluded.
     */

    public void setSuccessfulEntries(java.util.Collection<BatchUpdateRecommendationStatusSuccessfulEntry> successfulEntries) {
        if (successfulEntries == null) {
            this.successfulEntries = null;
            return;
        }

        this.successfulEntries = new java.util.ArrayList<BatchUpdateRecommendationStatusSuccessfulEntry>(successfulEntries);
    }

    /**
     * <p>
     * A list of items that were included or excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulEntries(java.util.Collection)} or {@link #withSuccessfulEntries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param successfulEntries
     *        A list of items that were included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusResult withSuccessfulEntries(BatchUpdateRecommendationStatusSuccessfulEntry... successfulEntries) {
        if (this.successfulEntries == null) {
            setSuccessfulEntries(new java.util.ArrayList<BatchUpdateRecommendationStatusSuccessfulEntry>(successfulEntries.length));
        }
        for (BatchUpdateRecommendationStatusSuccessfulEntry ele : successfulEntries) {
            this.successfulEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of items that were included or excluded.
     * </p>
     * 
     * @param successfulEntries
     *        A list of items that were included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusResult withSuccessfulEntries(java.util.Collection<BatchUpdateRecommendationStatusSuccessfulEntry> successfulEntries) {
        setSuccessfulEntries(successfulEntries);
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
        if (getFailedEntries() != null)
            sb.append("FailedEntries: ").append(getFailedEntries()).append(",");
        if (getSuccessfulEntries() != null)
            sb.append("SuccessfulEntries: ").append(getSuccessfulEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationStatusResult == false)
            return false;
        BatchUpdateRecommendationStatusResult other = (BatchUpdateRecommendationStatusResult) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getFailedEntries() == null ^ this.getFailedEntries() == null)
            return false;
        if (other.getFailedEntries() != null && other.getFailedEntries().equals(this.getFailedEntries()) == false)
            return false;
        if (other.getSuccessfulEntries() == null ^ this.getSuccessfulEntries() == null)
            return false;
        if (other.getSuccessfulEntries() != null && other.getSuccessfulEntries().equals(this.getSuccessfulEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getFailedEntries() == null) ? 0 : getFailedEntries().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulEntries() == null) ? 0 : getSuccessfulEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationStatusResult clone() {
        try {
            return (BatchUpdateRecommendationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
