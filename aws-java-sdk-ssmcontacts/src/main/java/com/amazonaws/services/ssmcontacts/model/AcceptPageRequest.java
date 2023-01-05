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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/AcceptPage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptPageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     */
    private String pageId;
    /**
     * <p>
     * The ARN of the contact channel.
     * </p>
     */
    private String contactChannelId;
    /**
     * <p>
     * The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * </p>
     */
    private String acceptType;
    /**
     * <p>
     * Information provided by the user when the user acknowledges the page.
     * </p>
     */
    private String note;
    /**
     * <p>
     * The accept code is a 6-digit code used to acknowledge the page.
     * </p>
     */
    private String acceptCode;
    /**
     * <p>
     * An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation when
     * acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the
     * console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user
     * matches the code sent by Incident Manager with the page.
     * </p>
     * <p>
     * Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     * <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     * <code>AcceptCode</code>.
     * </p>
     */
    private String acceptCodeValidation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @param pageId
     *        The Amazon Resource Name (ARN) of the engagement to a contact channel.
     */

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     */

    public String getPageId() {
        return this.pageId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * </p>
     * 
     * @param pageId
     *        The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPageRequest withPageId(String pageId) {
        setPageId(pageId);
        return this;
    }

    /**
     * <p>
     * The ARN of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The ARN of the contact channel.
     */

    public void setContactChannelId(String contactChannelId) {
        this.contactChannelId = contactChannelId;
    }

    /**
     * <p>
     * The ARN of the contact channel.
     * </p>
     * 
     * @return The ARN of the contact channel.
     */

    public String getContactChannelId() {
        return this.contactChannelId;
    }

    /**
     * <p>
     * The ARN of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The ARN of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPageRequest withContactChannelId(String contactChannelId) {
        setContactChannelId(contactChannelId);
        return this;
    }

    /**
     * <p>
     * The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * </p>
     * 
     * @param acceptType
     *        The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * @see AcceptType
     */

    public void setAcceptType(String acceptType) {
        this.acceptType = acceptType;
    }

    /**
     * <p>
     * The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * </p>
     * 
     * @return The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * @see AcceptType
     */

    public String getAcceptType() {
        return this.acceptType;
    }

    /**
     * <p>
     * The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * </p>
     * 
     * @param acceptType
     *        The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptType
     */

    public AcceptPageRequest withAcceptType(String acceptType) {
        setAcceptType(acceptType);
        return this;
    }

    /**
     * <p>
     * The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * </p>
     * 
     * @param acceptType
     *        The type indicates if the page was <code>DELIVERED</code> or <code>READ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptType
     */

    public AcceptPageRequest withAcceptType(AcceptType acceptType) {
        this.acceptType = acceptType.toString();
        return this;
    }

    /**
     * <p>
     * Information provided by the user when the user acknowledges the page.
     * </p>
     * 
     * @param note
     *        Information provided by the user when the user acknowledges the page.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * <p>
     * Information provided by the user when the user acknowledges the page.
     * </p>
     * 
     * @return Information provided by the user when the user acknowledges the page.
     */

    public String getNote() {
        return this.note;
    }

    /**
     * <p>
     * Information provided by the user when the user acknowledges the page.
     * </p>
     * 
     * @param note
     *        Information provided by the user when the user acknowledges the page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPageRequest withNote(String note) {
        setNote(note);
        return this;
    }

    /**
     * <p>
     * The accept code is a 6-digit code used to acknowledge the page.
     * </p>
     * 
     * @param acceptCode
     *        The accept code is a 6-digit code used to acknowledge the page.
     */

    public void setAcceptCode(String acceptCode) {
        this.acceptCode = acceptCode;
    }

    /**
     * <p>
     * The accept code is a 6-digit code used to acknowledge the page.
     * </p>
     * 
     * @return The accept code is a 6-digit code used to acknowledge the page.
     */

    public String getAcceptCode() {
        return this.acceptCode;
    }

    /**
     * <p>
     * The accept code is a 6-digit code used to acknowledge the page.
     * </p>
     * 
     * @param acceptCode
     *        The accept code is a 6-digit code used to acknowledge the page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPageRequest withAcceptCode(String acceptCode) {
        setAcceptCode(acceptCode);
        return this;
    }

    /**
     * <p>
     * An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation when
     * acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the
     * console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user
     * matches the code sent by Incident Manager with the page.
     * </p>
     * <p>
     * Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     * <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     * <code>AcceptCode</code>.
     * </p>
     * 
     * @param acceptCodeValidation
     *        An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation
     *        when acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the
     *        AcceptCode in the console. Enforcing AcceptCode validation causes Incident Manager to verify that the code
     *        entered by the user matches the code sent by Incident Manager with the page.</p>
     *        <p>
     *        Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     *        <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     *        <code>AcceptCode</code>.
     * @see AcceptCodeValidation
     */

    public void setAcceptCodeValidation(String acceptCodeValidation) {
        this.acceptCodeValidation = acceptCodeValidation;
    }

    /**
     * <p>
     * An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation when
     * acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the
     * console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user
     * matches the code sent by Incident Manager with the page.
     * </p>
     * <p>
     * Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     * <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     * <code>AcceptCode</code>.
     * </p>
     * 
     * @return An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation
     *         when acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the
     *         AcceptCode in the console. Enforcing AcceptCode validation causes Incident Manager to verify that the
     *         code entered by the user matches the code sent by Incident Manager with the page.</p>
     *         <p>
     *         Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     *         <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     *         <code>AcceptCode</code>.
     * @see AcceptCodeValidation
     */

    public String getAcceptCodeValidation() {
        return this.acceptCodeValidation;
    }

    /**
     * <p>
     * An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation when
     * acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the
     * console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user
     * matches the code sent by Incident Manager with the page.
     * </p>
     * <p>
     * Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     * <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     * <code>AcceptCode</code>.
     * </p>
     * 
     * @param acceptCodeValidation
     *        An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation
     *        when acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the
     *        AcceptCode in the console. Enforcing AcceptCode validation causes Incident Manager to verify that the code
     *        entered by the user matches the code sent by Incident Manager with the page.</p>
     *        <p>
     *        Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     *        <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     *        <code>AcceptCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptCodeValidation
     */

    public AcceptPageRequest withAcceptCodeValidation(String acceptCodeValidation) {
        setAcceptCodeValidation(acceptCodeValidation);
        return this;
    }

    /**
     * <p>
     * An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation when
     * acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the AcceptCode in the
     * console. Enforcing AcceptCode validation causes Incident Manager to verify that the code entered by the user
     * matches the code sent by Incident Manager with the page.
     * </p>
     * <p>
     * Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     * <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     * <code>AcceptCode</code>.
     * </p>
     * 
     * @param acceptCodeValidation
     *        An optional field that Incident Manager uses to <code>ENFORCE</code> <code>AcceptCode</code> validation
     *        when acknowledging an page. Acknowledgement can occur by replying to a page, or when entering the
     *        AcceptCode in the console. Enforcing AcceptCode validation causes Incident Manager to verify that the code
     *        entered by the user matches the code sent by Incident Manager with the page.</p>
     *        <p>
     *        Incident Manager can also <code>IGNORE</code> <code>AcceptCode</code> validation. Ignoring
     *        <code>AcceptCode</code> validation causes Incident Manager to accept any value entered for the
     *        <code>AcceptCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptCodeValidation
     */

    public AcceptPageRequest withAcceptCodeValidation(AcceptCodeValidation acceptCodeValidation) {
        this.acceptCodeValidation = acceptCodeValidation.toString();
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
        if (getPageId() != null)
            sb.append("PageId: ").append(getPageId()).append(",");
        if (getContactChannelId() != null)
            sb.append("ContactChannelId: ").append(getContactChannelId()).append(",");
        if (getAcceptType() != null)
            sb.append("AcceptType: ").append(getAcceptType()).append(",");
        if (getNote() != null)
            sb.append("Note: ").append(getNote()).append(",");
        if (getAcceptCode() != null)
            sb.append("AcceptCode: ").append(getAcceptCode()).append(",");
        if (getAcceptCodeValidation() != null)
            sb.append("AcceptCodeValidation: ").append(getAcceptCodeValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptPageRequest == false)
            return false;
        AcceptPageRequest other = (AcceptPageRequest) obj;
        if (other.getPageId() == null ^ this.getPageId() == null)
            return false;
        if (other.getPageId() != null && other.getPageId().equals(this.getPageId()) == false)
            return false;
        if (other.getContactChannelId() == null ^ this.getContactChannelId() == null)
            return false;
        if (other.getContactChannelId() != null && other.getContactChannelId().equals(this.getContactChannelId()) == false)
            return false;
        if (other.getAcceptType() == null ^ this.getAcceptType() == null)
            return false;
        if (other.getAcceptType() != null && other.getAcceptType().equals(this.getAcceptType()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getAcceptCode() == null ^ this.getAcceptCode() == null)
            return false;
        if (other.getAcceptCode() != null && other.getAcceptCode().equals(this.getAcceptCode()) == false)
            return false;
        if (other.getAcceptCodeValidation() == null ^ this.getAcceptCodeValidation() == null)
            return false;
        if (other.getAcceptCodeValidation() != null && other.getAcceptCodeValidation().equals(this.getAcceptCodeValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageId() == null) ? 0 : getPageId().hashCode());
        hashCode = prime * hashCode + ((getContactChannelId() == null) ? 0 : getContactChannelId().hashCode());
        hashCode = prime * hashCode + ((getAcceptType() == null) ? 0 : getAcceptType().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode + ((getAcceptCode() == null) ? 0 : getAcceptCode().hashCode());
        hashCode = prime * hashCode + ((getAcceptCodeValidation() == null) ? 0 : getAcceptCodeValidation().hashCode());
        return hashCode;
    }

    @Override
    public AcceptPageRequest clone() {
        return (AcceptPageRequest) super.clone();
    }

}
