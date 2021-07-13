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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetMigrations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMigrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use
     * the <code>migrationId</code> from the summary in a call to the operation.
     * </p>
     */
    private java.util.List<MigrationSummary> migrationSummaries;
    /**
     * <p>
     * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch
     * the next page of migrations.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use
     * the <code>migrationId</code> from the summary in a call to the operation.
     * </p>
     * 
     * @return An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the
     *         migration, use the <code>migrationId</code> from the summary in a call to the operation.
     */

    public java.util.List<MigrationSummary> getMigrationSummaries() {
        return migrationSummaries;
    }

    /**
     * <p>
     * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use
     * the <code>migrationId</code> from the summary in a call to the operation.
     * </p>
     * 
     * @param migrationSummaries
     *        An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration,
     *        use the <code>migrationId</code> from the summary in a call to the operation.
     */

    public void setMigrationSummaries(java.util.Collection<MigrationSummary> migrationSummaries) {
        if (migrationSummaries == null) {
            this.migrationSummaries = null;
            return;
        }

        this.migrationSummaries = new java.util.ArrayList<MigrationSummary>(migrationSummaries);
    }

    /**
     * <p>
     * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use
     * the <code>migrationId</code> from the summary in a call to the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMigrationSummaries(java.util.Collection)} or {@link #withMigrationSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param migrationSummaries
     *        An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration,
     *        use the <code>migrationId</code> from the summary in a call to the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsResult withMigrationSummaries(MigrationSummary... migrationSummaries) {
        if (this.migrationSummaries == null) {
            setMigrationSummaries(new java.util.ArrayList<MigrationSummary>(migrationSummaries.length));
        }
        for (MigrationSummary ele : migrationSummaries) {
            this.migrationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration, use
     * the <code>migrationId</code> from the summary in a call to the operation.
     * </p>
     * 
     * @param migrationSummaries
     *        An array of summaries for migrations from Amazon Lex V1 to Amazon Lex V2. To see details of the migration,
     *        use the <code>migrationId</code> from the summary in a call to the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsResult withMigrationSummaries(java.util.Collection<MigrationSummary> migrationSummaries) {
        setMigrationSummaries(migrationSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch
     * the next page of migrations.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, it includes a pagination token that you can specify in your next request to
     *        fetch the next page of migrations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch
     * the next page of migrations.
     * </p>
     * 
     * @return If the response is truncated, it includes a pagination token that you can specify in your next request to
     *         fetch the next page of migrations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch
     * the next page of migrations.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, it includes a pagination token that you can specify in your next request to
     *        fetch the next page of migrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMigrationSummaries() != null)
            sb.append("MigrationSummaries: ").append(getMigrationSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMigrationsResult == false)
            return false;
        GetMigrationsResult other = (GetMigrationsResult) obj;
        if (other.getMigrationSummaries() == null ^ this.getMigrationSummaries() == null)
            return false;
        if (other.getMigrationSummaries() != null && other.getMigrationSummaries().equals(this.getMigrationSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationSummaries() == null) ? 0 : getMigrationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetMigrationsResult clone() {
        try {
            return (GetMigrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
