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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build output artifacts for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, <code>path</code> is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored in
     * the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     */
    private String namespaceType;
    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and <code>name</code> is
     * set to "<code>/</code>", the output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String packaging;
    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     */
    private Boolean overrideArtifactName;
    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type
     * is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     */
    private Boolean encryptionDisabled;
    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     */
    private String artifactIdentifier;

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build output artifact. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @see ArtifactsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of build output artifact. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     *         </p>
     *         </li>
     * @see ArtifactsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build output artifact. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ProjectArtifacts withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build output artifact. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @see ArtifactsType
     */

    public void setType(ArtifactsType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of build output artifact. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code>: The build project has build output generated through AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_ARTIFACTS</code>: The build project does not produce any build output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project stores build output in Amazon Simple Storage Service (Amazon S3).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ProjectArtifacts withType(ArtifactsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the build output artifact location:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the build output artifact location:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *         specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *         build output is produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the build output artifact location:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, <code>path</code> is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored in
     * the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @param path
     *        Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name
     *        and store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *        <code>path</code> is not specified, <code>path</code> is not used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, <code>path</code> is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored in
     * the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @return Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name
     *         and store the output artifact:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *         build output is produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *         <code>path</code> is not specified, <code>path</code> is not used.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set
     *         to <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *         stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If <code>path</code> is
     * not specified, <code>path</code> is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored in
     * the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * 
     * @param path
     *        Along with <code>namespaceType</code> and <code>name</code>, the pattern that AWS CodeBuild uses to name
     *        and store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the path to the output artifact. If
     *        <code>path</code> is not specified, <code>path</code> is not used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>NONE</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the
     *        name and location to store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public void setNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @return Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the
     *         name and location to store the output artifact:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *         build output is produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *         specified.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set
     *         to <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     *         artifact is stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public String getNamespaceType() {
        return this.namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the
     *        name and location to store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactNamespace
     */

    public ProjectArtifacts withNamespaceType(String namespaceType) {
        setNamespaceType(namespaceType);
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the
     *        name and location to store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @see ArtifactNamespace
     */

    public void setNamespaceType(ArtifactNamespace namespaceType) {
        withNamespaceType(namespaceType);
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     * specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is stored
     * in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * 
     * @param namespaceType
     *        Along with <code>path</code> and <code>name</code>, the pattern that AWS CodeBuild uses to determine the
     *        name and location to store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_ID</code>: Include the build ID in the location of the build output artifact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not include the build ID. This is the default if <code>namespaceType</code> is not
     *        specified.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, the output artifact is
     *        stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactNamespace
     */

    public ProjectArtifacts withNamespaceType(ArtifactNamespace namespaceType) {
        this.namespaceType = namespaceType.toString();
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and <code>name</code> is
     * set to "<code>/</code>", the output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name
     *        and store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set
     *        the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact is stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and
     *        <code>name</code> is set to "<code>/</code>", the output artifact is stored in the root of the output
     *        bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     *        <code>MyArtifacts/<i>build-ID</i> </code>.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and <code>name</code> is
     * set to "<code>/</code>", the output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name
     *         and store the output artifact:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *         specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *         build output is produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you
     *         set the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *         <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *         artifact is stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and
     *         <code>name</code> is set to "<code>/</code>", the output artifact is stored in the root of the output
     *         bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *         <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     *         <code>MyArtifacts/<i>build-ID</i> </code>.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name and
     * store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and <code>name</code> is
     * set to "<code>/</code>", the output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     * <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        Along with <code>path</code> and <code>namespaceType</code>, the pattern that AWS CodeBuild uses to name
     *        and store the output artifact:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, this is the name of the output artifact object. If you set
     *        the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     *        artifact is stored in <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>path</code> is empty, <code>namespaceType</code> is set to <code>NONE</code>, and
     *        <code>name</code> is set to "<code>/</code>", the output artifact is stored in the root of the output
     *        bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>path</code> is set to <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *        <code>BUILD_ID</code>, and <code>name</code> is set to "<code>/</code>", the output artifact is stored in
     *        <code>MyArtifacts/<i>build-ID</i> </code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ArtifactPackaging
     */

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The type of build output artifact to create:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *         specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *         build output is produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output.
     *         This is the default if <code>packaging</code> is not specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ArtifactPackaging
     */

    public String getPackaging() {
        return this.packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactPackaging
     */

    public ProjectArtifacts withPackaging(String packaging) {
        setPackaging(packaging);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ArtifactPackaging
     */

    public void setPackaging(ArtifactPackaging packaging) {
        withPackaging(packaging);
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if specified. This
     * is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no build
     * output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is
     * the default if <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS CodePipeline ignores this value if
     *        specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is ignored if specified, because no
     *        build output is produced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>type</code> is set to <code>S3</code>, valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder that contains the build output.
     *        This is the default if <code>packaging</code> is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactPackaging
     */

    public ProjectArtifacts withPackaging(ArtifactPackaging packaging) {
        this.packaging = packaging.toString();
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @param overrideArtifactName
     *        If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *        specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *        example, you can append a date and time to your artifact name so that it is always unique.
     */

    public void setOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @return If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *         specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *         example, you can append a date and time to your artifact name so that it is always unique.
     */

    public Boolean getOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @param overrideArtifactName
     *        If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *        specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *        example, you can append a date and time to your artifact name so that it is always unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withOverrideArtifactName(Boolean overrideArtifactName) {
        setOverrideArtifactName(overrideArtifactName);
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @return If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *         specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *         example, you can append a date and time to your artifact name so that it is always unique.
     */

    public Boolean isOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type
     * is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     * 
     * @param encryptionDisabled
     *        Set to true if you do not want your output artifacts encrypted. This option is valid only if your
     *        artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type,
     *        an invalidInputException is thrown.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type
     * is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     * 
     * @return Set to true if you do not want your output artifacts encrypted. This option is valid only if your
     *         artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type,
     *         an invalidInputException is thrown.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type
     * is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     * 
     * @param encryptionDisabled
     *        Set to true if you do not want your output artifacts encrypted. This option is valid only if your
     *        artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type,
     *        an invalidInputException is thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type
     * is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     * 
     * @return Set to true if you do not want your output artifacts encrypted. This option is valid only if your
     *         artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type,
     *         an invalidInputException is thrown.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for this artifact definition.
     */

    public void setArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @return An identifier for this artifact definition.
     */

    public String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for this artifact definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectArtifacts withArtifactIdentifier(String artifactIdentifier) {
        setArtifactIdentifier(artifactIdentifier);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getNamespaceType() != null)
            sb.append("NamespaceType: ").append(getNamespaceType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPackaging() != null)
            sb.append("Packaging: ").append(getPackaging()).append(",");
        if (getOverrideArtifactName() != null)
            sb.append("OverrideArtifactName: ").append(getOverrideArtifactName()).append(",");
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled()).append(",");
        if (getArtifactIdentifier() != null)
            sb.append("ArtifactIdentifier: ").append(getArtifactIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectArtifacts == false)
            return false;
        ProjectArtifacts other = (ProjectArtifacts) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getNamespaceType() == null ^ this.getNamespaceType() == null)
            return false;
        if (other.getNamespaceType() != null && other.getNamespaceType().equals(this.getNamespaceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        if (other.getOverrideArtifactName() == null ^ this.getOverrideArtifactName() == null)
            return false;
        if (other.getOverrideArtifactName() != null && other.getOverrideArtifactName().equals(this.getOverrideArtifactName()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getArtifactIdentifier() == null ^ this.getArtifactIdentifier() == null)
            return false;
        if (other.getArtifactIdentifier() != null && other.getArtifactIdentifier().equals(this.getArtifactIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getNamespaceType() == null) ? 0 : getNamespaceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        hashCode = prime * hashCode + ((getOverrideArtifactName() == null) ? 0 : getOverrideArtifactName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode + ((getArtifactIdentifier() == null) ? 0 : getArtifactIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ProjectArtifacts clone() {
        try {
            return (ProjectArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
