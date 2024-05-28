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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Defines the list of operational recommendations that need to be included or excluded.
     * </p>
     */
    private java.util.List<UpdateRecommendationStatusRequestEntry> requestEntries;

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

    public BatchUpdateRecommendationStatusRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Defines the list of operational recommendations that need to be included or excluded.
     * </p>
     * 
     * @return Defines the list of operational recommendations that need to be included or excluded.
     */

    public java.util.List<UpdateRecommendationStatusRequestEntry> getRequestEntries() {
        return requestEntries;
    }

    /**
     * <p>
     * Defines the list of operational recommendations that need to be included or excluded.
     * </p>
     * 
     * @param requestEntries
     *        Defines the list of operational recommendations that need to be included or excluded.
     */

    public void setRequestEntries(java.util.Collection<UpdateRecommendationStatusRequestEntry> requestEntries) {
        if (requestEntries == null) {
            this.requestEntries = null;
            return;
        }

        this.requestEntries = new java.util.ArrayList<UpdateRecommendationStatusRequestEntry>(requestEntries);
    }

    /**
     * <p>
     * Defines the list of operational recommendations that need to be included or excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestEntries(java.util.Collection)} or {@link #withRequestEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param requestEntries
     *        Defines the list of operational recommendations that need to be included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusRequest withRequestEntries(UpdateRecommendationStatusRequestEntry... requestEntries) {
        if (this.requestEntries == null) {
            setRequestEntries(new java.util.ArrayList<UpdateRecommendationStatusRequestEntry>(requestEntries.length));
        }
        for (UpdateRecommendationStatusRequestEntry ele : requestEntries) {
            this.requestEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the list of operational recommendations that need to be included or excluded.
     * </p>
     * 
     * @param requestEntries
     *        Defines the list of operational recommendations that need to be included or excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusRequest withRequestEntries(java.util.Collection<UpdateRecommendationStatusRequestEntry> requestEntries) {
        setRequestEntries(requestEntries);
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
        if (getRequestEntries() != null)
            sb.append("RequestEntries: ").append(getRequestEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationStatusRequest == false)
            return false;
        BatchUpdateRecommendationStatusRequest other = (BatchUpdateRecommendationStatusRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getRequestEntries() == null ^ this.getRequestEntries() == null)
            return false;
        if (other.getRequestEntries() != null && other.getRequestEntries().equals(this.getRequestEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getRequestEntries() == null) ? 0 : getRequestEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationStatusRequest clone() {
        return (BatchUpdateRecommendationStatusRequest) super.clone();
    }

}
