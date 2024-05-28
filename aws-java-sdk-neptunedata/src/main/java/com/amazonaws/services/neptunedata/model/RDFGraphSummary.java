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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The RDF graph summary API returns a read-only list of classes and predicate keys, along with counts of quads,
 * subjects, and predicates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/RDFGraphSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDFGraphSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of distinct subjects in the graph.
     * </p>
     */
    private Long numDistinctSubjects;
    /**
     * <p>
     * The number of distinct predicates in the graph.
     * </p>
     */
    private Long numDistinctPredicates;
    /**
     * <p>
     * The number of quads in the graph.
     * </p>
     */
    private Long numQuads;
    /**
     * <p>
     * The number of classes in the graph.
     * </p>
     */
    private Long numClasses;
    /**
     * <p>
     * A list of the classes in the graph.
     * </p>
     */
    private java.util.List<String> classes;
    /**
     * <p>
     * "A list of predicates in the graph, along with the predicate counts.
     * </p>
     */
    private java.util.List<java.util.Map<String, Long>> predicates;
    /**
     * <p>
     * This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     * structures.
     * </p>
     */
    private java.util.List<SubjectStructure> subjectStructures;

    /**
     * <p>
     * The number of distinct subjects in the graph.
     * </p>
     * 
     * @param numDistinctSubjects
     *        The number of distinct subjects in the graph.
     */

    public void setNumDistinctSubjects(Long numDistinctSubjects) {
        this.numDistinctSubjects = numDistinctSubjects;
    }

    /**
     * <p>
     * The number of distinct subjects in the graph.
     * </p>
     * 
     * @return The number of distinct subjects in the graph.
     */

    public Long getNumDistinctSubjects() {
        return this.numDistinctSubjects;
    }

    /**
     * <p>
     * The number of distinct subjects in the graph.
     * </p>
     * 
     * @param numDistinctSubjects
     *        The number of distinct subjects in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withNumDistinctSubjects(Long numDistinctSubjects) {
        setNumDistinctSubjects(numDistinctSubjects);
        return this;
    }

    /**
     * <p>
     * The number of distinct predicates in the graph.
     * </p>
     * 
     * @param numDistinctPredicates
     *        The number of distinct predicates in the graph.
     */

    public void setNumDistinctPredicates(Long numDistinctPredicates) {
        this.numDistinctPredicates = numDistinctPredicates;
    }

    /**
     * <p>
     * The number of distinct predicates in the graph.
     * </p>
     * 
     * @return The number of distinct predicates in the graph.
     */

    public Long getNumDistinctPredicates() {
        return this.numDistinctPredicates;
    }

    /**
     * <p>
     * The number of distinct predicates in the graph.
     * </p>
     * 
     * @param numDistinctPredicates
     *        The number of distinct predicates in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withNumDistinctPredicates(Long numDistinctPredicates) {
        setNumDistinctPredicates(numDistinctPredicates);
        return this;
    }

    /**
     * <p>
     * The number of quads in the graph.
     * </p>
     * 
     * @param numQuads
     *        The number of quads in the graph.
     */

    public void setNumQuads(Long numQuads) {
        this.numQuads = numQuads;
    }

    /**
     * <p>
     * The number of quads in the graph.
     * </p>
     * 
     * @return The number of quads in the graph.
     */

    public Long getNumQuads() {
        return this.numQuads;
    }

    /**
     * <p>
     * The number of quads in the graph.
     * </p>
     * 
     * @param numQuads
     *        The number of quads in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withNumQuads(Long numQuads) {
        setNumQuads(numQuads);
        return this;
    }

    /**
     * <p>
     * The number of classes in the graph.
     * </p>
     * 
     * @param numClasses
     *        The number of classes in the graph.
     */

    public void setNumClasses(Long numClasses) {
        this.numClasses = numClasses;
    }

    /**
     * <p>
     * The number of classes in the graph.
     * </p>
     * 
     * @return The number of classes in the graph.
     */

    public Long getNumClasses() {
        return this.numClasses;
    }

    /**
     * <p>
     * The number of classes in the graph.
     * </p>
     * 
     * @param numClasses
     *        The number of classes in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withNumClasses(Long numClasses) {
        setNumClasses(numClasses);
        return this;
    }

    /**
     * <p>
     * A list of the classes in the graph.
     * </p>
     * 
     * @return A list of the classes in the graph.
     */

    public java.util.List<String> getClasses() {
        return classes;
    }

    /**
     * <p>
     * A list of the classes in the graph.
     * </p>
     * 
     * @param classes
     *        A list of the classes in the graph.
     */

    public void setClasses(java.util.Collection<String> classes) {
        if (classes == null) {
            this.classes = null;
            return;
        }

        this.classes = new java.util.ArrayList<String>(classes);
    }

    /**
     * <p>
     * A list of the classes in the graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClasses(java.util.Collection)} or {@link #withClasses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param classes
     *        A list of the classes in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withClasses(String... classes) {
        if (this.classes == null) {
            setClasses(new java.util.ArrayList<String>(classes.length));
        }
        for (String ele : classes) {
            this.classes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the classes in the graph.
     * </p>
     * 
     * @param classes
     *        A list of the classes in the graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withClasses(java.util.Collection<String> classes) {
        setClasses(classes);
        return this;
    }

    /**
     * <p>
     * "A list of predicates in the graph, along with the predicate counts.
     * </p>
     * 
     * @return "A list of predicates in the graph, along with the predicate counts.
     */

    public java.util.List<java.util.Map<String, Long>> getPredicates() {
        return predicates;
    }

    /**
     * <p>
     * "A list of predicates in the graph, along with the predicate counts.
     * </p>
     * 
     * @param predicates
     *        "A list of predicates in the graph, along with the predicate counts.
     */

    public void setPredicates(java.util.Collection<java.util.Map<String, Long>> predicates) {
        if (predicates == null) {
            this.predicates = null;
            return;
        }

        this.predicates = new java.util.ArrayList<java.util.Map<String, Long>>(predicates);
    }

    /**
     * <p>
     * "A list of predicates in the graph, along with the predicate counts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredicates(java.util.Collection)} or {@link #withPredicates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param predicates
     *        "A list of predicates in the graph, along with the predicate counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withPredicates(java.util.Map<String, Long>... predicates) {
        if (this.predicates == null) {
            setPredicates(new java.util.ArrayList<java.util.Map<String, Long>>(predicates.length));
        }
        for (java.util.Map<String, Long> ele : predicates) {
            this.predicates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * "A list of predicates in the graph, along with the predicate counts.
     * </p>
     * 
     * @param predicates
     *        "A list of predicates in the graph, along with the predicate counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withPredicates(java.util.Collection<java.util.Map<String, Long>> predicates) {
        setPredicates(predicates);
        return this;
    }

    /**
     * <p>
     * This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     * structures.
     * </p>
     * 
     * @return This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     *         structures.
     */

    public java.util.List<SubjectStructure> getSubjectStructures() {
        return subjectStructures;
    }

    /**
     * <p>
     * This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     * structures.
     * </p>
     * 
     * @param subjectStructures
     *        This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     *        structures.
     */

    public void setSubjectStructures(java.util.Collection<SubjectStructure> subjectStructures) {
        if (subjectStructures == null) {
            this.subjectStructures = null;
            return;
        }

        this.subjectStructures = new java.util.ArrayList<SubjectStructure>(subjectStructures);
    }

    /**
     * <p>
     * This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     * structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectStructures(java.util.Collection)} or {@link #withSubjectStructures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subjectStructures
     *        This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withSubjectStructures(SubjectStructure... subjectStructures) {
        if (this.subjectStructures == null) {
            setSubjectStructures(new java.util.ArrayList<SubjectStructure>(subjectStructures.length));
        }
        for (SubjectStructure ele : subjectStructures) {
            this.subjectStructures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     * structures.
     * </p>
     * 
     * @param subjectStructures
     *        This field is only present when the request mode is <code>DETAILED</code>. It contains a list of subject
     *        structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummary withSubjectStructures(java.util.Collection<SubjectStructure> subjectStructures) {
        setSubjectStructures(subjectStructures);
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
        if (getNumDistinctSubjects() != null)
            sb.append("NumDistinctSubjects: ").append(getNumDistinctSubjects()).append(",");
        if (getNumDistinctPredicates() != null)
            sb.append("NumDistinctPredicates: ").append(getNumDistinctPredicates()).append(",");
        if (getNumQuads() != null)
            sb.append("NumQuads: ").append(getNumQuads()).append(",");
        if (getNumClasses() != null)
            sb.append("NumClasses: ").append(getNumClasses()).append(",");
        if (getClasses() != null)
            sb.append("Classes: ").append(getClasses()).append(",");
        if (getPredicates() != null)
            sb.append("Predicates: ").append(getPredicates()).append(",");
        if (getSubjectStructures() != null)
            sb.append("SubjectStructures: ").append(getSubjectStructures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDFGraphSummary == false)
            return false;
        RDFGraphSummary other = (RDFGraphSummary) obj;
        if (other.getNumDistinctSubjects() == null ^ this.getNumDistinctSubjects() == null)
            return false;
        if (other.getNumDistinctSubjects() != null && other.getNumDistinctSubjects().equals(this.getNumDistinctSubjects()) == false)
            return false;
        if (other.getNumDistinctPredicates() == null ^ this.getNumDistinctPredicates() == null)
            return false;
        if (other.getNumDistinctPredicates() != null && other.getNumDistinctPredicates().equals(this.getNumDistinctPredicates()) == false)
            return false;
        if (other.getNumQuads() == null ^ this.getNumQuads() == null)
            return false;
        if (other.getNumQuads() != null && other.getNumQuads().equals(this.getNumQuads()) == false)
            return false;
        if (other.getNumClasses() == null ^ this.getNumClasses() == null)
            return false;
        if (other.getNumClasses() != null && other.getNumClasses().equals(this.getNumClasses()) == false)
            return false;
        if (other.getClasses() == null ^ this.getClasses() == null)
            return false;
        if (other.getClasses() != null && other.getClasses().equals(this.getClasses()) == false)
            return false;
        if (other.getPredicates() == null ^ this.getPredicates() == null)
            return false;
        if (other.getPredicates() != null && other.getPredicates().equals(this.getPredicates()) == false)
            return false;
        if (other.getSubjectStructures() == null ^ this.getSubjectStructures() == null)
            return false;
        if (other.getSubjectStructures() != null && other.getSubjectStructures().equals(this.getSubjectStructures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumDistinctSubjects() == null) ? 0 : getNumDistinctSubjects().hashCode());
        hashCode = prime * hashCode + ((getNumDistinctPredicates() == null) ? 0 : getNumDistinctPredicates().hashCode());
        hashCode = prime * hashCode + ((getNumQuads() == null) ? 0 : getNumQuads().hashCode());
        hashCode = prime * hashCode + ((getNumClasses() == null) ? 0 : getNumClasses().hashCode());
        hashCode = prime * hashCode + ((getClasses() == null) ? 0 : getClasses().hashCode());
        hashCode = prime * hashCode + ((getPredicates() == null) ? 0 : getPredicates().hashCode());
        hashCode = prime * hashCode + ((getSubjectStructures() == null) ? 0 : getSubjectStructures().hashCode());
        return hashCode;
    }

    @Override
    public RDFGraphSummary clone() {
        try {
            return (RDFGraphSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.RDFGraphSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
