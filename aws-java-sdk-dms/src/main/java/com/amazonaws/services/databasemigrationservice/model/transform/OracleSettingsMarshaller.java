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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OracleSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OracleSettingsMarshaller {

    private static final MarshallingInfo<Boolean> ADDSUPPLEMENTALLOGGING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddSupplementalLogging").build();
    private static final MarshallingInfo<Integer> ARCHIVEDLOGDESTID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchivedLogDestId").build();
    private static final MarshallingInfo<Integer> ADDITIONALARCHIVEDLOGDESTID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalArchivedLogDestId").build();
    private static final MarshallingInfo<Boolean> ALLOWSELECTNESTEDTABLES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowSelectNestedTables").build();
    private static final MarshallingInfo<Integer> PARALLELASMREADTHREADS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelAsmReadThreads").build();
    private static final MarshallingInfo<Integer> READAHEADBLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadAheadBlocks").build();
    private static final MarshallingInfo<Boolean> ACCESSALTERNATEDIRECTLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessAlternateDirectly").build();
    private static final MarshallingInfo<Boolean> USEALTERNATEFOLDERFORONLINE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseAlternateFolderForOnline").build();
    private static final MarshallingInfo<String> ORACLEPATHPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OraclePathPrefix").build();
    private static final MarshallingInfo<String> USEPATHPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsePathPrefix").build();
    private static final MarshallingInfo<Boolean> REPLACEPATHPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplacePathPrefix").build();
    private static final MarshallingInfo<Boolean> ENABLEHOMOGENOUSTABLESPACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableHomogenousTablespace").build();
    private static final MarshallingInfo<Boolean> DIRECTPATHNOLOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectPathNoLog").build();
    private static final MarshallingInfo<Boolean> ARCHIVEDLOGSONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchivedLogsOnly").build();
    private static final MarshallingInfo<String> ASMPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AsmPassword").build();
    private static final MarshallingInfo<String> ASMSERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AsmServer").build();
    private static final MarshallingInfo<String> ASMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AsmUser").build();
    private static final MarshallingInfo<String> CHARLENGTHSEMANTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CharLengthSemantics").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<Boolean> DIRECTPATHPARALLELLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectPathParallelLoad").build();
    private static final MarshallingInfo<Boolean> FAILTASKSONLOBTRUNCATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailTasksOnLobTruncation").build();
    private static final MarshallingInfo<Integer> NUMBERDATATYPESCALE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberDatatypeScale").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<Boolean> READTABLESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadTableSpaceName").build();
    private static final MarshallingInfo<Integer> RETRYINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryInterval").build();
    private static final MarshallingInfo<String> SECURITYDBENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityDbEncryption").build();
    private static final MarshallingInfo<String> SECURITYDBENCRYPTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityDbEncryptionName").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> SPATIALDATAOPTIONTOGEOJSONFUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpatialDataOptionToGeoJsonFunctionName").build();
    private static final MarshallingInfo<Integer> STANDBYDELAYTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandbyDelayTime").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<Boolean> USEBFILE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseBFile").build();
    private static final MarshallingInfo<Boolean> USEDIRECTPATHFULLLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseDirectPathFullLoad").build();
    private static final MarshallingInfo<Boolean> USELOGMINERREADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseLogminerReader").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();
    private static final MarshallingInfo<String> SECRETSMANAGERORACLEASMACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerOracleAsmAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERORACLEASMSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerOracleAsmSecretId").build();

    private static final OracleSettingsMarshaller instance = new OracleSettingsMarshaller();

    public static OracleSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OracleSettings oracleSettings, ProtocolMarshaller protocolMarshaller) {

        if (oracleSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oracleSettings.getAddSupplementalLogging(), ADDSUPPLEMENTALLOGGING_BINDING);
            protocolMarshaller.marshall(oracleSettings.getArchivedLogDestId(), ARCHIVEDLOGDESTID_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAdditionalArchivedLogDestId(), ADDITIONALARCHIVEDLOGDESTID_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAllowSelectNestedTables(), ALLOWSELECTNESTEDTABLES_BINDING);
            protocolMarshaller.marshall(oracleSettings.getParallelAsmReadThreads(), PARALLELASMREADTHREADS_BINDING);
            protocolMarshaller.marshall(oracleSettings.getReadAheadBlocks(), READAHEADBLOCKS_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAccessAlternateDirectly(), ACCESSALTERNATEDIRECTLY_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUseAlternateFolderForOnline(), USEALTERNATEFOLDERFORONLINE_BINDING);
            protocolMarshaller.marshall(oracleSettings.getOraclePathPrefix(), ORACLEPATHPREFIX_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUsePathPrefix(), USEPATHPREFIX_BINDING);
            protocolMarshaller.marshall(oracleSettings.getReplacePathPrefix(), REPLACEPATHPREFIX_BINDING);
            protocolMarshaller.marshall(oracleSettings.getEnableHomogenousTablespace(), ENABLEHOMOGENOUSTABLESPACE_BINDING);
            protocolMarshaller.marshall(oracleSettings.getDirectPathNoLog(), DIRECTPATHNOLOG_BINDING);
            protocolMarshaller.marshall(oracleSettings.getArchivedLogsOnly(), ARCHIVEDLOGSONLY_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAsmPassword(), ASMPASSWORD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAsmServer(), ASMSERVER_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAsmUser(), ASMUSER_BINDING);
            protocolMarshaller.marshall(oracleSettings.getCharLengthSemantics(), CHARLENGTHSEMANTICS_BINDING);
            protocolMarshaller.marshall(oracleSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getDirectPathParallelLoad(), DIRECTPATHPARALLELLOAD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getFailTasksOnLobTruncation(), FAILTASKSONLOBTRUNCATION_BINDING);
            protocolMarshaller.marshall(oracleSettings.getNumberDatatypeScale(), NUMBERDATATYPESCALE_BINDING);
            protocolMarshaller.marshall(oracleSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(oracleSettings.getReadTableSpaceName(), READTABLESPACENAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getRetryInterval(), RETRYINTERVAL_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecurityDbEncryption(), SECURITYDBENCRYPTION_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecurityDbEncryptionName(), SECURITYDBENCRYPTIONNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSpatialDataOptionToGeoJsonFunctionName(), SPATIALDATAOPTIONTOGEOJSONFUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getStandbyDelayTime(), STANDBYDELAYTIME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUseBFile(), USEBFILE_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUseDirectPathFullLoad(), USEDIRECTPATHFULLLOAD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUseLogminerReader(), USELOGMINERREADER_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecretsManagerOracleAsmAccessRoleArn(), SECRETSMANAGERORACLEASMACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecretsManagerOracleAsmSecretId(), SECRETSMANAGERORACLEASMSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
