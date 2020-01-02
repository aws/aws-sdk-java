/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/SendCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCommandRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the session token for the current command. A session token is constant throughout the life of the
     * session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is required
     * for every subsequent command that is issued during the current session.
     * </p>
     */
    private String sessionToken;
    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of the response.
     * </p>
     */
    private StartSessionRequest startSession;
    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     */
    private StartTransactionRequest startTransaction;
    /**
     * <p>
     * Command to end the current session.
     * </p>
     */
    private EndSessionRequest endSession;
    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     */
    private CommitTransactionRequest commitTransaction;
    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     */
    private AbortTransactionRequest abortTransaction;
    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     */
    private ExecuteStatementRequest executeStatement;
    /**
     * <p>
     * Command to fetch a page.
     * </p>
     */
    private FetchPageRequest fetchPage;

    /**
     * <p>
     * Specifies the session token for the current command. A session token is constant throughout the life of the
     * session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is required
     * for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @param sessionToken
     *        Specifies the session token for the current command. A session token is constant throughout the life of
     *        the session.</p>
     *        <p>
     *        To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is
     *        required for every subsequent command that is issued during the current session.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Specifies the session token for the current command. A session token is constant throughout the life of the
     * session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is required
     * for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @return Specifies the session token for the current command. A session token is constant throughout the life of
     *         the session.</p>
     *         <p>
     *         To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is
     *         required for every subsequent command that is issued during the current session.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * Specifies the session token for the current command. A session token is constant throughout the life of the
     * session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is required
     * for every subsequent command that is issued during the current session.
     * </p>
     * 
     * @param sessionToken
     *        Specifies the session token for the current command. A session token is constant throughout the life of
     *        the session.</p>
     *        <p>
     *        To obtain a session token, run the <code>StartSession</code> command. This <code>SessionToken</code> is
     *        required for every subsequent command that is issued during the current session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
        return this;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of the response.
     * </p>
     * 
     * @param startSession
     *        Command to start a new session. A session token is obtained as part of the response.
     */

    public void setStartSession(StartSessionRequest startSession) {
        this.startSession = startSession;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of the response.
     * </p>
     * 
     * @return Command to start a new session. A session token is obtained as part of the response.
     */

    public StartSessionRequest getStartSession() {
        return this.startSession;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of the response.
     * </p>
     * 
     * @param startSession
     *        Command to start a new session. A session token is obtained as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withStartSession(StartSessionRequest startSession) {
        setStartSession(startSession);
        return this;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     * 
     * @param startTransaction
     *        Command to start a new transaction.
     */

    public void setStartTransaction(StartTransactionRequest startTransaction) {
        this.startTransaction = startTransaction;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     * 
     * @return Command to start a new transaction.
     */

    public StartTransactionRequest getStartTransaction() {
        return this.startTransaction;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     * 
     * @param startTransaction
     *        Command to start a new transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withStartTransaction(StartTransactionRequest startTransaction) {
        setStartTransaction(startTransaction);
        return this;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     * 
     * @param endSession
     *        Command to end the current session.
     */

    public void setEndSession(EndSessionRequest endSession) {
        this.endSession = endSession;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     * 
     * @return Command to end the current session.
     */

    public EndSessionRequest getEndSession() {
        return this.endSession;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     * 
     * @param endSession
     *        Command to end the current session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withEndSession(EndSessionRequest endSession) {
        setEndSession(endSession);
        return this;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     * 
     * @param commitTransaction
     *        Command to commit the specified transaction.
     */

    public void setCommitTransaction(CommitTransactionRequest commitTransaction) {
        this.commitTransaction = commitTransaction;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     * 
     * @return Command to commit the specified transaction.
     */

    public CommitTransactionRequest getCommitTransaction() {
        return this.commitTransaction;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     * 
     * @param commitTransaction
     *        Command to commit the specified transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withCommitTransaction(CommitTransactionRequest commitTransaction) {
        setCommitTransaction(commitTransaction);
        return this;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     * 
     * @param abortTransaction
     *        Command to abort the current transaction.
     */

    public void setAbortTransaction(AbortTransactionRequest abortTransaction) {
        this.abortTransaction = abortTransaction;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     * 
     * @return Command to abort the current transaction.
     */

    public AbortTransactionRequest getAbortTransaction() {
        return this.abortTransaction;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     * 
     * @param abortTransaction
     *        Command to abort the current transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withAbortTransaction(AbortTransactionRequest abortTransaction) {
        setAbortTransaction(abortTransaction);
        return this;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     * 
     * @param executeStatement
     *        Command to execute a statement in the specified transaction.
     */

    public void setExecuteStatement(ExecuteStatementRequest executeStatement) {
        this.executeStatement = executeStatement;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     * 
     * @return Command to execute a statement in the specified transaction.
     */

    public ExecuteStatementRequest getExecuteStatement() {
        return this.executeStatement;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     * 
     * @param executeStatement
     *        Command to execute a statement in the specified transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withExecuteStatement(ExecuteStatementRequest executeStatement) {
        setExecuteStatement(executeStatement);
        return this;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     * 
     * @param fetchPage
     *        Command to fetch a page.
     */

    public void setFetchPage(FetchPageRequest fetchPage) {
        this.fetchPage = fetchPage;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     * 
     * @return Command to fetch a page.
     */

    public FetchPageRequest getFetchPage() {
        return this.fetchPage;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     * 
     * @param fetchPage
     *        Command to fetch a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withFetchPage(FetchPageRequest fetchPage) {
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
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken()).append(",");
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

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
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
    public SendCommandRequest clone() {
        return (SendCommandRequest) super.clone();
    }

}
