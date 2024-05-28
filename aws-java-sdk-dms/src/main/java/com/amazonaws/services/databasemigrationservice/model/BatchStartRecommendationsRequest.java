/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/BatchStartRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target
     * engines for each source database.
     * </p>
     */
    private java.util.List<StartRecommendationsRequestEntry> data;

    /**
     * <p>
     * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target
     * engines for each source database.
     * </p>
     * 
     * @return Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends
     *         target engines for each source database.
     */

    public java.util.List<StartRecommendationsRequestEntry> getData() {
        return data;
    }

    /**
     * <p>
     * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target
     * engines for each source database.
     * </p>
     * 
     * @param data
     *        Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends
     *        target engines for each source database.
     */

    public void setData(java.util.Collection<StartRecommendationsRequestEntry> data) {
        if (data == null) {
            this.data = null;
            return;
        }

        this.data = new java.util.ArrayList<StartRecommendationsRequestEntry>(data);
    }

    /**
     * <p>
     * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target
     * engines for each source database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setData(java.util.Collection)} or {@link #withData(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param data
     *        Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends
     *        target engines for each source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartRecommendationsRequest withData(StartRecommendationsRequestEntry... data) {
        if (this.data == null) {
            setData(new java.util.ArrayList<StartRecommendationsRequestEntry>(data.length));
        }
        for (StartRecommendationsRequestEntry ele : data) {
            this.data.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends target
     * engines for each source database.
     * </p>
     * 
     * @param data
     *        Provides information about source databases to analyze. After this analysis, Fleet Advisor recommends
     *        target engines for each source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartRecommendationsRequest withData(java.util.Collection<StartRecommendationsRequestEntry> data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStartRecommendationsRequest == false)
            return false;
        BatchStartRecommendationsRequest other = (BatchStartRecommendationsRequest) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public BatchStartRecommendationsRequest clone() {
        return (BatchStartRecommendationsRequest) super.clone();
    }

}
