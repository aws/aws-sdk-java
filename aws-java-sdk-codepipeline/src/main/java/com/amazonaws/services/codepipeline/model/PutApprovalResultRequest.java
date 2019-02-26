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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a PutApprovalResult action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutApprovalResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApprovalResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline that contains the action.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The name of the action for which approval is requested.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * Represents information about the result of the approval request.
     * </p>
     */
    private ApprovalResult result;
    /**
     * <p>
     * The system-generated token used to identify a unique approval request. The token for each open approval request
     * can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval request
     * corresponding to this token is still valid.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The name of the pipeline that contains the action.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that contains the action.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that contains the action.
     * </p>
     * 
     * @return The name of the pipeline that contains the action.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that contains the action.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that contains the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @return The name of the stage that contains the action.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The name of the action for which approval is requested.
     * </p>
     * 
     * @param actionName
     *        The name of the action for which approval is requested.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action for which approval is requested.
     * </p>
     * 
     * @return The name of the action for which approval is requested.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action for which approval is requested.
     * </p>
     * 
     * @param actionName
     *        The name of the action for which approval is requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * Represents information about the result of the approval request.
     * </p>
     * 
     * @param result
     *        Represents information about the result of the approval request.
     */

    public void setResult(ApprovalResult result) {
        this.result = result;
    }

    /**
     * <p>
     * Represents information about the result of the approval request.
     * </p>
     * 
     * @return Represents information about the result of the approval request.
     */

    public ApprovalResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * Represents information about the result of the approval request.
     * </p>
     * 
     * @param result
     *        Represents information about the result of the approval request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultRequest withResult(ApprovalResult result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique approval request. The token for each open approval request
     * can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval request
     * corresponding to this token is still valid.
     * </p>
     * 
     * @param token
     *        The system-generated token used to identify a unique approval request. The token for each open approval
     *        request can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval
     *        request corresponding to this token is still valid.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique approval request. The token for each open approval request
     * can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval request
     * corresponding to this token is still valid.
     * </p>
     * 
     * @return The system-generated token used to identify a unique approval request. The token for each open approval
     *         request can be obtained using the <a>GetPipelineState</a> action and is used to validate that the
     *         approval request corresponding to this token is still valid.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique approval request. The token for each open approval request
     * can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval request
     * corresponding to this token is still valid.
     * </p>
     * 
     * @param token
     *        The system-generated token used to identify a unique approval request. The token for each open approval
     *        request can be obtained using the <a>GetPipelineState</a> action and is used to validate that the approval
     *        request corresponding to this token is still valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultRequest withToken(String token) {
        setToken(token);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutApprovalResultRequest == false)
            return false;
        PutApprovalResultRequest other = (PutApprovalResultRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public PutApprovalResultRequest clone() {
        return (PutApprovalResultRequest) super.clone();
    }

}
