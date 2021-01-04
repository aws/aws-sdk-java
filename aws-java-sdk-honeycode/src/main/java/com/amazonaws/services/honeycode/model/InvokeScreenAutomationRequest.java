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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeScreenAutomationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     */
    private String workbookId;
    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     */
    private String screenId;
    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     */
    private String screenAutomationId;
    /**
     * <p>
     * Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is
     * an object which currently has only one property, rawValue, which holds the value of the variable to be passed to
     * the screen. Any variables defined in a screen are required to be passed in the call.
     * </p>
     */
    private java.util.Map<String, VariableValue> variables;
    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block with source or list.
     * </p>
     */
    private String rowId;
    /**
     * <p>
     * The request token for performing the automation action. Request tokens help to identify duplicate requests. If a
     * call times out or fails due to a transient error like a failed network connection, you can retry the call with
     * the same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will return the response of the previous call rather than performing the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the screen automation.
     */

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * 
     * @return The ID of the workbook that contains the screen automation.
     */

    public String getWorkbookId() {
        return this.workbookId;
    }

    /**
     * <p>
     * The ID of the workbook that contains the screen automation.
     * </p>
     * 
     * @param workbookId
     *        The ID of the workbook that contains the screen automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withWorkbookId(String workbookId) {
        setWorkbookId(workbookId);
        return this;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * 
     * @param appId
     *        The ID of the app that contains the screen automation.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * 
     * @return The ID of the app that contains the screen automation.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the app that contains the screen automation.
     * </p>
     * 
     * @param appId
     *        The ID of the app that contains the screen automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * 
     * @param screenId
     *        The ID of the screen that contains the screen automation.
     */

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * 
     * @return The ID of the screen that contains the screen automation.
     */

    public String getScreenId() {
        return this.screenId;
    }

    /**
     * <p>
     * The ID of the screen that contains the screen automation.
     * </p>
     * 
     * @param screenId
     *        The ID of the screen that contains the screen automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withScreenId(String screenId) {
        setScreenId(screenId);
        return this;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * 
     * @param screenAutomationId
     *        The ID of the automation action to be performed.
     */

    public void setScreenAutomationId(String screenAutomationId) {
        this.screenAutomationId = screenAutomationId;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * 
     * @return The ID of the automation action to be performed.
     */

    public String getScreenAutomationId() {
        return this.screenAutomationId;
    }

    /**
     * <p>
     * The ID of the automation action to be performed.
     * </p>
     * 
     * @param screenAutomationId
     *        The ID of the automation action to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withScreenAutomationId(String screenAutomationId) {
        setScreenAutomationId(screenAutomationId);
        return this;
    }

    /**
     * <p>
     * Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is
     * an object which currently has only one property, rawValue, which holds the value of the variable to be passed to
     * the screen. Any variables defined in a screen are required to be passed in the call.
     * </p>
     * 
     * @return Variables are specified as a map where the key is the name of the variable as defined on the screen. The
     *         value is an object which currently has only one property, rawValue, which holds the value of the variable
     *         to be passed to the screen. Any variables defined in a screen are required to be passed in the call.
     */

    public java.util.Map<String, VariableValue> getVariables() {
        return variables;
    }

    /**
     * <p>
     * Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is
     * an object which currently has only one property, rawValue, which holds the value of the variable to be passed to
     * the screen. Any variables defined in a screen are required to be passed in the call.
     * </p>
     * 
     * @param variables
     *        Variables are specified as a map where the key is the name of the variable as defined on the screen. The
     *        value is an object which currently has only one property, rawValue, which holds the value of the variable
     *        to be passed to the screen. Any variables defined in a screen are required to be passed in the call.
     */

    public void setVariables(java.util.Map<String, VariableValue> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is
     * an object which currently has only one property, rawValue, which holds the value of the variable to be passed to
     * the screen. Any variables defined in a screen are required to be passed in the call.
     * </p>
     * 
     * @param variables
     *        Variables are specified as a map where the key is the name of the variable as defined on the screen. The
     *        value is an object which currently has only one property, rawValue, which holds the value of the variable
     *        to be passed to the screen. Any variables defined in a screen are required to be passed in the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withVariables(java.util.Map<String, VariableValue> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * Add a single Variables entry
     *
     * @see InvokeScreenAutomationRequest#withVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest addVariablesEntry(String key, VariableValue value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, VariableValue>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block with source or list.
     * </p>
     * 
     * @param rowId
     *        The row ID for the automation if the automation is defined inside a block with source or list.
     */

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block with source or list.
     * </p>
     * 
     * @return The row ID for the automation if the automation is defined inside a block with source or list.
     */

    public String getRowId() {
        return this.rowId;
    }

    /**
     * <p>
     * The row ID for the automation if the automation is defined inside a block with source or list.
     * </p>
     * 
     * @param rowId
     *        The row ID for the automation if the automation is defined inside a block with source or list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withRowId(String rowId) {
        setRowId(rowId);
        return this;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens help to identify duplicate requests. If a
     * call times out or fails due to a transient error like a failed network connection, you can retry the call with
     * the same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will return the response of the previous call rather than performing the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the automation action. Request tokens help to identify duplicate
     *        requests. If a call times out or fails due to a transient error like a failed network connection, you can
     *        retry the call with the same request token. The service ensures that if the first call using that request
     *        token is successfully performed, the second call will return the response of the previous call rather than
     *        performing the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens help to identify duplicate requests. If a
     * call times out or fails due to a transient error like a failed network connection, you can retry the call with
     * the same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will return the response of the previous call rather than performing the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @return The request token for performing the automation action. Request tokens help to identify duplicate
     *         requests. If a call times out or fails due to a transient error like a failed network connection, you can
     *         retry the call with the same request token. The service ensures that if the first call using that request
     *         token is successfully performed, the second call will return the response of the previous call rather
     *         than performing the action again. </p>
     *         <p>
     *         Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *         requests spanning hours or days.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The request token for performing the automation action. Request tokens help to identify duplicate requests. If a
     * call times out or fails due to a transient error like a failed network connection, you can retry the call with
     * the same request token. The service ensures that if the first call using that request token is successfully
     * performed, the second call will return the response of the previous call rather than performing the action again.
     * </p>
     * <p>
     * Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests
     * spanning hours or days.
     * </p>
     * 
     * @param clientRequestToken
     *        The request token for performing the automation action. Request tokens help to identify duplicate
     *        requests. If a call times out or fails due to a transient error like a failed network connection, you can
     *        retry the call with the same request token. The service ensures that if the first call using that request
     *        token is successfully performed, the second call will return the response of the previous call rather than
     *        performing the action again. </p>
     *        <p>
     *        Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe
     *        requests spanning hours or days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeScreenAutomationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getWorkbookId() != null)
            sb.append("WorkbookId: ").append(getWorkbookId()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getScreenId() != null)
            sb.append("ScreenId: ").append(getScreenId()).append(",");
        if (getScreenAutomationId() != null)
            sb.append("ScreenAutomationId: ").append(getScreenAutomationId()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append("***Sensitive Data Redacted***").append(",");
        if (getRowId() != null)
            sb.append("RowId: ").append(getRowId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeScreenAutomationRequest == false)
            return false;
        InvokeScreenAutomationRequest other = (InvokeScreenAutomationRequest) obj;
        if (other.getWorkbookId() == null ^ this.getWorkbookId() == null)
            return false;
        if (other.getWorkbookId() != null && other.getWorkbookId().equals(this.getWorkbookId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getScreenId() == null ^ this.getScreenId() == null)
            return false;
        if (other.getScreenId() != null && other.getScreenId().equals(this.getScreenId()) == false)
            return false;
        if (other.getScreenAutomationId() == null ^ this.getScreenAutomationId() == null)
            return false;
        if (other.getScreenAutomationId() != null && other.getScreenAutomationId().equals(this.getScreenAutomationId()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkbookId() == null) ? 0 : getWorkbookId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getScreenId() == null) ? 0 : getScreenId().hashCode());
        hashCode = prime * hashCode + ((getScreenAutomationId() == null) ? 0 : getScreenAutomationId().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public InvokeScreenAutomationRequest clone() {
        return (InvokeScreenAutomationRequest) super.clone();
    }

}
