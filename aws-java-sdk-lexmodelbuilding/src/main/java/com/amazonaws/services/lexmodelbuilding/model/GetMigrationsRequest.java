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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetMigrations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMigrationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that
     * the migration was started.
     * </p>
     */
    private String sortByAttribute;
    /**
     * <p>
     * The order so sort the list.
     * </p>
     */
    private String sortByOrder;
    /**
     * <p>
     * Filters the list to contain only bots whose name contains the specified string. The string is matched anywhere in
     * bot name.
     * </p>
     */
    private String v1BotNameContains;
    /**
     * <p>
     * Filters the list to contain only migrations in the specified state.
     * </p>
     */
    private String migrationStatusEquals;
    /**
     * <p>
     * The maximum number of migrations to return in the response. The default is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token that fetches the next page of migrations. If the response to this operation is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of migrations, specify the
     * pagination token in the request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that
     * the migration was started.
     * </p>
     * 
     * @param sortByAttribute
     *        The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and
     *        time that the migration was started.
     * @see MigrationSortAttribute
     */

    public void setSortByAttribute(String sortByAttribute) {
        this.sortByAttribute = sortByAttribute;
    }

    /**
     * <p>
     * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that
     * the migration was started.
     * </p>
     * 
     * @return The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and
     *         time that the migration was started.
     * @see MigrationSortAttribute
     */

    public String getSortByAttribute() {
        return this.sortByAttribute;
    }

    /**
     * <p>
     * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that
     * the migration was started.
     * </p>
     * 
     * @param sortByAttribute
     *        The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and
     *        time that the migration was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationSortAttribute
     */

    public GetMigrationsRequest withSortByAttribute(String sortByAttribute) {
        setSortByAttribute(sortByAttribute);
        return this;
    }

    /**
     * <p>
     * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that
     * the migration was started.
     * </p>
     * 
     * @param sortByAttribute
     *        The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and
     *        time that the migration was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationSortAttribute
     */

    public GetMigrationsRequest withSortByAttribute(MigrationSortAttribute sortByAttribute) {
        this.sortByAttribute = sortByAttribute.toString();
        return this;
    }

    /**
     * <p>
     * The order so sort the list.
     * </p>
     * 
     * @param sortByOrder
     *        The order so sort the list.
     * @see SortOrder
     */

    public void setSortByOrder(String sortByOrder) {
        this.sortByOrder = sortByOrder;
    }

    /**
     * <p>
     * The order so sort the list.
     * </p>
     * 
     * @return The order so sort the list.
     * @see SortOrder
     */

    public String getSortByOrder() {
        return this.sortByOrder;
    }

    /**
     * <p>
     * The order so sort the list.
     * </p>
     * 
     * @param sortByOrder
     *        The order so sort the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public GetMigrationsRequest withSortByOrder(String sortByOrder) {
        setSortByOrder(sortByOrder);
        return this;
    }

    /**
     * <p>
     * The order so sort the list.
     * </p>
     * 
     * @param sortByOrder
     *        The order so sort the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public GetMigrationsRequest withSortByOrder(SortOrder sortByOrder) {
        this.sortByOrder = sortByOrder.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list to contain only bots whose name contains the specified string. The string is matched anywhere in
     * bot name.
     * </p>
     * 
     * @param v1BotNameContains
     *        Filters the list to contain only bots whose name contains the specified string. The string is matched
     *        anywhere in bot name.
     */

    public void setV1BotNameContains(String v1BotNameContains) {
        this.v1BotNameContains = v1BotNameContains;
    }

    /**
     * <p>
     * Filters the list to contain only bots whose name contains the specified string. The string is matched anywhere in
     * bot name.
     * </p>
     * 
     * @return Filters the list to contain only bots whose name contains the specified string. The string is matched
     *         anywhere in bot name.
     */

    public String getV1BotNameContains() {
        return this.v1BotNameContains;
    }

    /**
     * <p>
     * Filters the list to contain only bots whose name contains the specified string. The string is matched anywhere in
     * bot name.
     * </p>
     * 
     * @param v1BotNameContains
     *        Filters the list to contain only bots whose name contains the specified string. The string is matched
     *        anywhere in bot name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsRequest withV1BotNameContains(String v1BotNameContains) {
        setV1BotNameContains(v1BotNameContains);
        return this;
    }

    /**
     * <p>
     * Filters the list to contain only migrations in the specified state.
     * </p>
     * 
     * @param migrationStatusEquals
     *        Filters the list to contain only migrations in the specified state.
     * @see MigrationStatus
     */

    public void setMigrationStatusEquals(String migrationStatusEquals) {
        this.migrationStatusEquals = migrationStatusEquals;
    }

    /**
     * <p>
     * Filters the list to contain only migrations in the specified state.
     * </p>
     * 
     * @return Filters the list to contain only migrations in the specified state.
     * @see MigrationStatus
     */

    public String getMigrationStatusEquals() {
        return this.migrationStatusEquals;
    }

    /**
     * <p>
     * Filters the list to contain only migrations in the specified state.
     * </p>
     * 
     * @param migrationStatusEquals
     *        Filters the list to contain only migrations in the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStatus
     */

    public GetMigrationsRequest withMigrationStatusEquals(String migrationStatusEquals) {
        setMigrationStatusEquals(migrationStatusEquals);
        return this;
    }

    /**
     * <p>
     * Filters the list to contain only migrations in the specified state.
     * </p>
     * 
     * @param migrationStatusEquals
     *        Filters the list to contain only migrations in the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStatus
     */

    public GetMigrationsRequest withMigrationStatusEquals(MigrationStatus migrationStatusEquals) {
        this.migrationStatusEquals = migrationStatusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of migrations to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of migrations to return in the response. The default is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of migrations to return in the response. The default is 10.
     * </p>
     * 
     * @return The maximum number of migrations to return in the response. The default is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of migrations to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of migrations to return in the response. The default is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of migrations. If the response to this operation is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of migrations, specify the
     * pagination token in the request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of migrations. If the response to this operation is
     *        truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of migrations,
     *        specify the pagination token in the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of migrations. If the response to this operation is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of migrations, specify the
     * pagination token in the request.
     * </p>
     * 
     * @return A pagination token that fetches the next page of migrations. If the response to this operation is
     *         truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of migrations,
     *         specify the pagination token in the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of migrations. If the response to this operation is truncated,
     * Amazon Lex returns a pagination token in the response. To fetch the next page of migrations, specify the
     * pagination token in the request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of migrations. If the response to this operation is
     *        truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of migrations,
     *        specify the pagination token in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationsRequest withNextToken(String nextToken) {
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
        if (getSortByAttribute() != null)
            sb.append("SortByAttribute: ").append(getSortByAttribute()).append(",");
        if (getSortByOrder() != null)
            sb.append("SortByOrder: ").append(getSortByOrder()).append(",");
        if (getV1BotNameContains() != null)
            sb.append("V1BotNameContains: ").append(getV1BotNameContains()).append(",");
        if (getMigrationStatusEquals() != null)
            sb.append("MigrationStatusEquals: ").append(getMigrationStatusEquals()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetMigrationsRequest == false)
            return false;
        GetMigrationsRequest other = (GetMigrationsRequest) obj;
        if (other.getSortByAttribute() == null ^ this.getSortByAttribute() == null)
            return false;
        if (other.getSortByAttribute() != null && other.getSortByAttribute().equals(this.getSortByAttribute()) == false)
            return false;
        if (other.getSortByOrder() == null ^ this.getSortByOrder() == null)
            return false;
        if (other.getSortByOrder() != null && other.getSortByOrder().equals(this.getSortByOrder()) == false)
            return false;
        if (other.getV1BotNameContains() == null ^ this.getV1BotNameContains() == null)
            return false;
        if (other.getV1BotNameContains() != null && other.getV1BotNameContains().equals(this.getV1BotNameContains()) == false)
            return false;
        if (other.getMigrationStatusEquals() == null ^ this.getMigrationStatusEquals() == null)
            return false;
        if (other.getMigrationStatusEquals() != null && other.getMigrationStatusEquals().equals(this.getMigrationStatusEquals()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getSortByAttribute() == null) ? 0 : getSortByAttribute().hashCode());
        hashCode = prime * hashCode + ((getSortByOrder() == null) ? 0 : getSortByOrder().hashCode());
        hashCode = prime * hashCode + ((getV1BotNameContains() == null) ? 0 : getV1BotNameContains().hashCode());
        hashCode = prime * hashCode + ((getMigrationStatusEquals() == null) ? 0 : getMigrationStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetMigrationsRequest clone() {
        return (GetMigrationsRequest) super.clone();
    }

}
