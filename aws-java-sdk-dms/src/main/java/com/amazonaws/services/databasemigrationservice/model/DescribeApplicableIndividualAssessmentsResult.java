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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeApplicableIndividualAssessments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicableIndividualAssessmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * List of names for the individual assessments supported by the premigration assessment run that you start based on
     * the specified request parameters. For more information on the available individual assessments, including
     * compatibility with different migration task configurations, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     * premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     */
    private java.util.List<String> individualAssessmentNames;
    /**
     * <p>
     * Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * List of names for the individual assessments supported by the premigration assessment run that you start based on
     * the specified request parameters. For more information on the available individual assessments, including
     * compatibility with different migration task configurations, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     * premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @return List of names for the individual assessments supported by the premigration assessment run that you start
     *         based on the specified request parameters. For more information on the available individual assessments,
     *         including compatibility with different migration task configurations, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     *         premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     */

    public java.util.List<String> getIndividualAssessmentNames() {
        return individualAssessmentNames;
    }

    /**
     * <p>
     * List of names for the individual assessments supported by the premigration assessment run that you start based on
     * the specified request parameters. For more information on the available individual assessments, including
     * compatibility with different migration task configurations, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     * premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param individualAssessmentNames
     *        List of names for the individual assessments supported by the premigration assessment run that you start
     *        based on the specified request parameters. For more information on the available individual assessments,
     *        including compatibility with different migration task configurations, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     *        premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     */

    public void setIndividualAssessmentNames(java.util.Collection<String> individualAssessmentNames) {
        if (individualAssessmentNames == null) {
            this.individualAssessmentNames = null;
            return;
        }

        this.individualAssessmentNames = new java.util.ArrayList<String>(individualAssessmentNames);
    }

    /**
     * <p>
     * List of names for the individual assessments supported by the premigration assessment run that you start based on
     * the specified request parameters. For more information on the available individual assessments, including
     * compatibility with different migration task configurations, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     * premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndividualAssessmentNames(java.util.Collection)} or
     * {@link #withIndividualAssessmentNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param individualAssessmentNames
     *        List of names for the individual assessments supported by the premigration assessment run that you start
     *        based on the specified request parameters. For more information on the available individual assessments,
     *        including compatibility with different migration task configurations, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     *        premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsResult withIndividualAssessmentNames(String... individualAssessmentNames) {
        if (this.individualAssessmentNames == null) {
            setIndividualAssessmentNames(new java.util.ArrayList<String>(individualAssessmentNames.length));
        }
        for (String ele : individualAssessmentNames) {
            this.individualAssessmentNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of names for the individual assessments supported by the premigration assessment run that you start based on
     * the specified request parameters. For more information on the available individual assessments, including
     * compatibility with different migration task configurations, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     * premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param individualAssessmentNames
     *        List of names for the individual assessments supported by the premigration assessment run that you start
     *        based on the specified request parameters. For more information on the available individual assessments,
     *        including compatibility with different migration task configurations, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Working with
     *        premigration assessment runs</a> in the <i>Database Migration Service User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsResult withIndividualAssessmentNames(java.util.Collection<String> individualAssessmentNames) {
        setIndividualAssessmentNames(individualAssessmentNames);
        return this;
    }

    /**
     * <p>
     * Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *        <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *        up to the value specified in the request by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @return Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *         <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *         up to the value specified in the request by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        Pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *        <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *        up to the value specified in the request by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getIndividualAssessmentNames() != null)
            sb.append("IndividualAssessmentNames: ").append(getIndividualAssessmentNames()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicableIndividualAssessmentsResult == false)
            return false;
        DescribeApplicableIndividualAssessmentsResult other = (DescribeApplicableIndividualAssessmentsResult) obj;
        if (other.getIndividualAssessmentNames() == null ^ this.getIndividualAssessmentNames() == null)
            return false;
        if (other.getIndividualAssessmentNames() != null && other.getIndividualAssessmentNames().equals(this.getIndividualAssessmentNames()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndividualAssessmentNames() == null) ? 0 : getIndividualAssessmentNames().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicableIndividualAssessmentsResult clone() {
        try {
            return (DescribeApplicableIndividualAssessmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
