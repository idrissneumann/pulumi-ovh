// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { CredentialArgs, CredentialState } from "./credential";
export type Credential = import("./credential").Credential;
export const Credential: typeof import("./credential").Credential = null as any;
utilities.lazyLoad(exports, ["Credential"], () => require("./credential"));

export { GetOkmsCredentialArgs, GetOkmsCredentialResult, GetOkmsCredentialOutputArgs } from "./getOkmsCredential";
export const getOkmsCredential: typeof import("./getOkmsCredential").getOkmsCredential = null as any;
export const getOkmsCredentialOutput: typeof import("./getOkmsCredential").getOkmsCredentialOutput = null as any;
utilities.lazyLoad(exports, ["getOkmsCredential","getOkmsCredentialOutput"], () => require("./getOkmsCredential"));

export { GetOkmsResourceArgs, GetOkmsResourceResult, GetOkmsResourceOutputArgs } from "./getOkmsResource";
export const getOkmsResource: typeof import("./getOkmsResource").getOkmsResource = null as any;
export const getOkmsResourceOutput: typeof import("./getOkmsResource").getOkmsResourceOutput = null as any;
utilities.lazyLoad(exports, ["getOkmsResource","getOkmsResourceOutput"], () => require("./getOkmsResource"));

export { GetOkmsServiceKeyArgs, GetOkmsServiceKeyResult, GetOkmsServiceKeyOutputArgs } from "./getOkmsServiceKey";
export const getOkmsServiceKey: typeof import("./getOkmsServiceKey").getOkmsServiceKey = null as any;
export const getOkmsServiceKeyOutput: typeof import("./getOkmsServiceKey").getOkmsServiceKeyOutput = null as any;
utilities.lazyLoad(exports, ["getOkmsServiceKey","getOkmsServiceKeyOutput"], () => require("./getOkmsServiceKey"));

export { GetOkmsServiceKeyJwkArgs, GetOkmsServiceKeyJwkResult, GetOkmsServiceKeyJwkOutputArgs } from "./getOkmsServiceKeyJwk";
export const getOkmsServiceKeyJwk: typeof import("./getOkmsServiceKeyJwk").getOkmsServiceKeyJwk = null as any;
export const getOkmsServiceKeyJwkOutput: typeof import("./getOkmsServiceKeyJwk").getOkmsServiceKeyJwkOutput = null as any;
utilities.lazyLoad(exports, ["getOkmsServiceKeyJwk","getOkmsServiceKeyJwkOutput"], () => require("./getOkmsServiceKeyJwk"));

export { OkmsArgs, OkmsState } from "./okms";
export type Okms = import("./okms").Okms;
export const Okms: typeof import("./okms").Okms = null as any;
utilities.lazyLoad(exports, ["Okms"], () => require("./okms"));

export { ServiceKeyArgs, ServiceKeyState } from "./serviceKey";
export type ServiceKey = import("./serviceKey").ServiceKey;
export const ServiceKey: typeof import("./serviceKey").ServiceKey = null as any;
utilities.lazyLoad(exports, ["ServiceKey"], () => require("./serviceKey"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "ovh:Okms/credential:Credential":
                return new Credential(name, <any>undefined, { urn })
            case "ovh:Okms/okms:Okms":
                return new Okms(name, <any>undefined, { urn })
            case "ovh:Okms/serviceKey:ServiceKey":
                return new ServiceKey(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("ovh", "Okms/credential", _module)
pulumi.runtime.registerResourceModule("ovh", "Okms/okms", _module)
pulumi.runtime.registerResourceModule("ovh", "Okms/serviceKey", _module)