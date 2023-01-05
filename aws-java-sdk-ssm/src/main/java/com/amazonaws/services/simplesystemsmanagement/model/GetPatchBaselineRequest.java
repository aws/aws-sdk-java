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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPatchBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the patch baseline to retrieve.
     * </p>
     * <note>
     * <p>
     * To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon Resource
     * Name (ARN) of the baseline. For example, for the baseline <code>AWS-AmazonLinuxDefaultPatchBaseline</code>,
     * specify <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     * <code>pb-0e392de35e7c563b7</code>.
     * </p>
     * </note>
     */
    private String baselineId;

    /**
     * <p>
     * The ID of the patch baseline to retrieve.
     * </p>
     * <note>
     * <p>
     * To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon Resource
     * Name (ARN) of the baseline. For example, for the baseline <code>AWS-AmazonLinuxDefaultPatchBaseline</code>,
     * specify <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     * <code>pb-0e392de35e7c563b7</code>.
     * </p>
     * </note>
     * 
     * @param baselineId
     *        The ID of the patch baseline to retrieve.</p> <note>
     *        <p>
     *        To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon
     *        Resource Name (ARN) of the baseline. For example, for the baseline
     *        <code>AWS-AmazonLinuxDefaultPatchBaseline</code>, specify
     *        <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     *        <code>pb-0e392de35e7c563b7</code>.
     *        </p>
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to retrieve.
     * </p>
     * <note>
     * <p>
     * To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon Resource
     * Name (ARN) of the baseline. For example, for the baseline <code>AWS-AmazonLinuxDefaultPatchBaseline</code>,
     * specify <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     * <code>pb-0e392de35e7c563b7</code>.
     * </p>
     * </note>
     * 
     * @return The ID of the patch baseline to retrieve.</p> <note>
     *         <p>
     *         To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon
     *         Resource Name (ARN) of the baseline. For example, for the baseline
     *         <code>AWS-AmazonLinuxDefaultPatchBaseline</code>, specify
     *         <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     *         <code>pb-0e392de35e7c563b7</code>.
     *         </p>
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to retrieve.
     * </p>
     * <note>
     * <p>
     * To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon Resource
     * Name (ARN) of the baseline. For example, for the baseline <code>AWS-AmazonLinuxDefaultPatchBaseline</code>,
     * specify <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     * <code>pb-0e392de35e7c563b7</code>.
     * </p>
     * </note>
     * 
     * @param baselineId
     *        The ID of the patch baseline to retrieve.</p> <note>
     *        <p>
     *        To retrieve information about an Amazon Web Services managed patch baseline, specify the full Amazon
     *        Resource Name (ARN) of the baseline. For example, for the baseline
     *        <code>AWS-AmazonLinuxDefaultPatchBaseline</code>, specify
     *        <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0e392de35e7c563b7</code> instead of
     *        <code>pb-0e392de35e7c563b7</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineRequest withBaselineId(String baselineId) {
        setBaselineId(baselineId);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPatchBaselineRequest == false)
            return false;
        GetPatchBaselineRequest other = (GetPatchBaselineRequest) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        return hashCode;
    }

    @Override
    public GetPatchBaselineRequest clone() {
        return (GetPatchBaselineRequest) super.clone();
    }

}
