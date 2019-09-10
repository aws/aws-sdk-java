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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/SendCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCommandResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the details of the started session that includes a session token. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current session.
     * </p>
     */
    private StartSessionResult startSession;
    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     */
    private StartTransactionResult startTransaction;
    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     */
    private EndSessionResult endSession;
    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     */
    private CommitTransactionResult commitTransaction;
    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     */
    private AbortTransactionResult abortTransaction;
    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     */
    private ExecuteStatementResult executeStatement;
    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     */
    private FetchPageResult fetchPage;

    /**
     * <p>
     * Contains the details of the started session that includes a session token. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @param startSession
     *        Contains the details of the started session that includes a session token. This <code>SessionToken</code>
     *        is required for every subsequent command that is issued during the current session.
     */

    public void setStartSession(StartSessionResult startSession) {
        this.startSession = startSession;
    }

    /**
     * <p>
     * Contains the details of the started session that includes a session token. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @return Contains the details of the started session that includes a session token. This <code>SessionToken</code>
     *         is required for every subsequent command that is issued during the current session.
     */

    public StartSessionResult getStartSession() {
        return this.startSession;
    }

    /**
     * <p>
     * Contains the details of the started session that includes a session token. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @param startSession
     *        Contains the details of the started session that includes a session token. This <code>SessionToken</code>
     *        is required for every subsequent command that is issued during the current session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withStartSession(StartSessionResult startSession) {
        setStartSession(startSession);
        return this;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     * 
     * @param startTransaction
     *        Contains the details of the started transaction.
     */

    public void setStartTransaction(StartTransactionResult startTransaction) {
        this.startTransaction = startTransaction;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     * 
     * @return Contains the details of the started transaction.
     */

    public StartTransactionResult getStartTransaction() {
        return this.startTransaction;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     * 
     * @param startTransaction
     *        Contains the details of the started transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withStartTransaction(StartTransactionResult startTransaction) {
        setStartTransaction(startTransaction);
        return this;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     * 
     * @param endSession
     *        Contains the details of the ended session.
     */

    public void setEndSession(EndSessionResult endSession) {
        this.endSession = endSession;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     * 
     * @return Contains the details of the ended session.
     */

    public EndSessionResult getEndSession() {
        return this.endSession;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     * 
     * @param endSession
     *        Contains the details of the ended session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withEndSession(EndSessionResult endSession) {
        setEndSession(endSession);
        return this;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     * 
     * @param commitTransaction
     *        Contains the details of the committed transaction.
     */

    public void setCommitTransaction(CommitTransactionResult commitTransaction) {
        this.commitTransaction = commitTransaction;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     * 
     * @return Contains the details of the committed transaction.
     */

    public CommitTransactionResult getCommitTransaction() {
        return this.commitTransaction;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     * 
     * @param commitTransaction
     *        Contains the details of the committed transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withCommitTransaction(CommitTransactionResult commitTransaction) {
        setCommitTransaction(commitTransaction);
        return this;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     * 
     * @param abortTransaction
     *        Contains the details of the aborted transaction.
     */

    public void setAbortTransaction(AbortTransactionResult abortTransaction) {
        this.abortTransaction = abortTransaction;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     * 
     * @return Contains the details of the aborted transaction.
     */

    public AbortTransactionResult getAbortTransaction() {
        return this.abortTransaction;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     * 
     * @param abortTransaction
     *        Contains the details of the aborted transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withAbortTransaction(AbortTransactionResult abortTransaction) {
        setAbortTransaction(abortTransaction);
        return this;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     * 
     * @param executeStatement
     *        Contains the details of the executed statement.
     */

    public void setExecuteStatement(ExecuteStatementResult executeStatement) {
        this.executeStatement = executeStatement;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     * 
     * @return Contains the details of the executed statement.
     */

    public ExecuteStatementResult getExecuteStatement() {
        return this.executeStatement;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     * 
     * @param executeStatement
     *        Contains the details of the executed statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withExecuteStatement(ExecuteStatementResult executeStatement) {
        setExecuteStatement(executeStatement);
        return this;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     * 
     * @param fetchPage
     *        Contains the details of the fetched page.
     */

    public void setFetchPage(FetchPageResult fetchPage) {
        this.fetchPage = fetchPage;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     * 
     * @return Contains the details of the fetched page.
     */

    public FetchPageResult getFetchPage() {
        return this.fetchPage;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     * 
     * @param fetchPage
     *        Contains the details of the fetched page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandResult withFetchPage(FetchPageResult fetchPage) {
        setFetchPage(fetchPage);
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
        if (getStartSession() != null)
            sb.append("StartSession: ").append(getStartSession()).append(",");
        if (getStartTransaction() != null)
            sb.append("StartTransaction: ").append(getStartTransaction()).append(",");
        if (getEndSession() != null)
            sb.append("EndSession: ").append(getEndSession()).append(",");
        if (getCommitTransaction() != null)
            sb.append("CommitTransaction: ").append(getCommitTransaction()).append(",");
        if (getAbortTransaction() != null)
            sb.append("AbortTransaction: ").append(getAbortTransaction()).append(",");
        if (getExecuteStatement() != null)
            sb.append("ExecuteStatement: ").append(getExecuteStatement()).append(",");
        if (getFetchPage() != null)
            sb.append("FetchPage: ").append(getFetchPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandResult == false)
            return false;
        SendCommandResult other = (SendCommandResult) obj;
        if (other.getStartSession() == null ^ this.getStartSession() == null)
            return false;
        if (other.getStartSession() != null && other.getStartSession().equals(this.getStartSession()) == false)
            return false;
        if (other.getStartTransaction() == null ^ this.getStartTransaction() == null)
            return false;
        if (other.getStartTransaction() != null && other.getStartTransaction().equals(this.getStartTransaction()) == false)
            return false;
        if (other.getEndSession() == null ^ this.getEndSession() == null)
            return false;
        if (other.getEndSession() != null && other.getEndSession().equals(this.getEndSession()) == false)
            return false;
        if (other.getCommitTransaction() == null ^ this.getCommitTransaction() == null)
            return false;
        if (other.getCommitTransaction() != null && other.getCommitTransaction().equals(this.getCommitTransaction()) == false)
            return false;
        if (other.getAbortTransaction() == null ^ this.getAbortTransaction() == null)
            return false;
        if (other.getAbortTransaction() != null && other.getAbortTransaction().equals(this.getAbortTransaction()) == false)
            return false;
        if (other.getExecuteStatement() == null ^ this.getExecuteStatement() == null)
            return false;
        if (other.getExecuteStatement() != null && other.getExecuteStatement().equals(this.getExecuteStatement()) == false)
            return false;
        if (other.getFetchPage() == null ^ this.getFetchPage() == null)
            return false;
        if (other.getFetchPage() != null && other.getFetchPage().equals(this.getFetchPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartSession() == null) ? 0 : getStartSession().hashCode());
        hashCode = prime * hashCode + ((getStartTransaction() == null) ? 0 : getStartTransaction().hashCode());
        hashCode = prime * hashCode + ((getEndSession() == null) ? 0 : getEndSession().hashCode());
        hashCode = prime * hashCode + ((getCommitTransaction() == null) ? 0 : getCommitTransaction().hashCode());
        hashCode = prime * hashCode + ((getAbortTransaction() == null) ? 0 : getAbortTransaction().hashCode());
        hashCode = prime * hashCode + ((getExecuteStatement() == null) ? 0 : getExecuteStatement().hashCode());
        hashCode = prime * hashCode + ((getFetchPage() == null) ? 0 : getFetchPage().hashCode());
        return hashCode;
    }

    @Override
    public SendCommandResult clone() {
        try {
            return (SendCommandResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
