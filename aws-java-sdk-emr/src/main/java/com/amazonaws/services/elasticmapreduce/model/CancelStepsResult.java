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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for the <a>CancelSteps</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelStepsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     * <code>StepID</code> specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CancelStepsInfo> cancelStepsInfoList;

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     * <code>StepID</code> specified.
     * </p>
     * 
     * @return A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     *         <code>StepID</code> specified.
     */

    public java.util.List<CancelStepsInfo> getCancelStepsInfoList() {
        if (cancelStepsInfoList == null) {
            cancelStepsInfoList = new com.amazonaws.internal.SdkInternalList<CancelStepsInfo>();
        }
        return cancelStepsInfoList;
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     * <code>StepID</code> specified.
     * </p>
     * 
     * @param cancelStepsInfoList
     *        A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     *        <code>StepID</code> specified.
     */

    public void setCancelStepsInfoList(java.util.Collection<CancelStepsInfo> cancelStepsInfoList) {
        if (cancelStepsInfoList == null) {
            this.cancelStepsInfoList = null;
            return;
        }

        this.cancelStepsInfoList = new com.amazonaws.internal.SdkInternalList<CancelStepsInfo>(cancelStepsInfoList);
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     * <code>StepID</code> specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCancelStepsInfoList(java.util.Collection)} or {@link #withCancelStepsInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cancelStepsInfoList
     *        A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     *        <code>StepID</code> specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsResult withCancelStepsInfoList(CancelStepsInfo... cancelStepsInfoList) {
        if (this.cancelStepsInfoList == null) {
            setCancelStepsInfoList(new com.amazonaws.internal.SdkInternalList<CancelStepsInfo>(cancelStepsInfoList.length));
        }
        for (CancelStepsInfo ele : cancelStepsInfoList) {
            this.cancelStepsInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     * <code>StepID</code> specified.
     * </p>
     * 
     * @param cancelStepsInfoList
     *        A list of <a>CancelStepsInfo</a>, which shows the status of specified cancel requests for each
     *        <code>StepID</code> specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsResult withCancelStepsInfoList(java.util.Collection<CancelStepsInfo> cancelStepsInfoList) {
        setCancelStepsInfoList(cancelStepsInfoList);
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
        if (getCancelStepsInfoList() != null)
            sb.append("CancelStepsInfoList: ").append(getCancelStepsInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStepsResult == false)
            return false;
        CancelStepsResult other = (CancelStepsResult) obj;
        if (other.getCancelStepsInfoList() == null ^ this.getCancelStepsInfoList() == null)
            return false;
        if (other.getCancelStepsInfoList() != null && other.getCancelStepsInfoList().equals(this.getCancelStepsInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancelStepsInfoList() == null) ? 0 : getCancelStepsInfoList().hashCode());
        return hashCode;
    }

    @Override
    public CancelStepsResult clone() {
        try {
            return (CancelStepsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
