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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBackupPlanTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of template list items containing metadata about your saved templates.
     * </p>
     */
    private java.util.List<BackupPlanTemplatesListMember> backupPlanTemplatesList;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlanTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of template list items containing metadata about your saved templates.
     * </p>
     * 
     * @return An array of template list items containing metadata about your saved templates.
     */

    public java.util.List<BackupPlanTemplatesListMember> getBackupPlanTemplatesList() {
        return backupPlanTemplatesList;
    }

    /**
     * <p>
     * An array of template list items containing metadata about your saved templates.
     * </p>
     * 
     * @param backupPlanTemplatesList
     *        An array of template list items containing metadata about your saved templates.
     */

    public void setBackupPlanTemplatesList(java.util.Collection<BackupPlanTemplatesListMember> backupPlanTemplatesList) {
        if (backupPlanTemplatesList == null) {
            this.backupPlanTemplatesList = null;
            return;
        }

        this.backupPlanTemplatesList = new java.util.ArrayList<BackupPlanTemplatesListMember>(backupPlanTemplatesList);
    }

    /**
     * <p>
     * An array of template list items containing metadata about your saved templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupPlanTemplatesList(java.util.Collection)} or
     * {@link #withBackupPlanTemplatesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param backupPlanTemplatesList
     *        An array of template list items containing metadata about your saved templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlanTemplatesResult withBackupPlanTemplatesList(BackupPlanTemplatesListMember... backupPlanTemplatesList) {
        if (this.backupPlanTemplatesList == null) {
            setBackupPlanTemplatesList(new java.util.ArrayList<BackupPlanTemplatesListMember>(backupPlanTemplatesList.length));
        }
        for (BackupPlanTemplatesListMember ele : backupPlanTemplatesList) {
            this.backupPlanTemplatesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of template list items containing metadata about your saved templates.
     * </p>
     * 
     * @param backupPlanTemplatesList
     *        An array of template list items containing metadata about your saved templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBackupPlanTemplatesResult withBackupPlanTemplatesList(java.util.Collection<BackupPlanTemplatesListMember> backupPlanTemplatesList) {
        setBackupPlanTemplatesList(backupPlanTemplatesList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBackupPlanTemplatesList() != null)
            sb.append("BackupPlanTemplatesList: ").append(getBackupPlanTemplatesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupPlanTemplatesResult == false)
            return false;
        ListBackupPlanTemplatesResult other = (ListBackupPlanTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBackupPlanTemplatesList() == null ^ this.getBackupPlanTemplatesList() == null)
            return false;
        if (other.getBackupPlanTemplatesList() != null && other.getBackupPlanTemplatesList().equals(this.getBackupPlanTemplatesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanTemplatesList() == null) ? 0 : getBackupPlanTemplatesList().hashCode());
        return hashCode;
    }

    @Override
    public ListBackupPlanTemplatesResult clone() {
        try {
            return (ListBackupPlanTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
