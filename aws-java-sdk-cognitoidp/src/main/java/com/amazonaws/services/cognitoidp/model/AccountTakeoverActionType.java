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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account takeover action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AccountTakeoverActionType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountTakeoverActionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     */
    private Boolean notify;
    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     */
    private String eventAction;

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     * 
     * @param notify
     *        Flag specifying whether to send a notification.
     */

    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     * 
     * @return Flag specifying whether to send a notification.
     */

    public Boolean getNotify() {
        return this.notify;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     * 
     * @param notify
     *        Flag specifying whether to send a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverActionType withNotify(Boolean notify) {
        setNotify(notify);
        return this;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     * 
     * @return Flag specifying whether to send a notification.
     */

    public Boolean isNotify() {
        return this.notify;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventAction
     *        The event action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> Choosing this action will block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ACTION</code> Allow the user sign-in.
     *        </p>
     *        </li>
     * @see AccountTakeoverEventActionType
     */

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event action.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BLOCK</code> Choosing this action will block the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_ACTION</code> Allow the user sign-in.
     *         </p>
     *         </li>
     * @see AccountTakeoverEventActionType
     */

    public String getEventAction() {
        return this.eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventAction
     *        The event action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> Choosing this action will block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ACTION</code> Allow the user sign-in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTakeoverEventActionType
     */

    public AccountTakeoverActionType withEventAction(String eventAction) {
        setEventAction(eventAction);
        return this;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventAction
     *        The event action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> Choosing this action will block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured it, else allow the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it, else block the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ACTION</code> Allow the user sign-in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTakeoverEventActionType
     */

    public AccountTakeoverActionType withEventAction(AccountTakeoverEventActionType eventAction) {
        this.eventAction = eventAction.toString();
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
        if (getNotify() != null)
            sb.append("Notify: ").append(getNotify()).append(",");
        if (getEventAction() != null)
            sb.append("EventAction: ").append(getEventAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountTakeoverActionType == false)
            return false;
        AccountTakeoverActionType other = (AccountTakeoverActionType) obj;
        if (other.getNotify() == null ^ this.getNotify() == null)
            return false;
        if (other.getNotify() != null && other.getNotify().equals(this.getNotify()) == false)
            return false;
        if (other.getEventAction() == null ^ this.getEventAction() == null)
            return false;
        if (other.getEventAction() != null && other.getEventAction().equals(this.getEventAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotify() == null) ? 0 : getNotify().hashCode());
        hashCode = prime * hashCode + ((getEventAction() == null) ? 0 : getEventAction().hashCode());
        return hashCode;
    }

    @Override
    public AccountTakeoverActionType clone() {
        try {
            return (AccountTakeoverActionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AccountTakeoverActionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
