plugins {
	`build-scan`
	id("com.gradle.plugin-publish") version "0.9.5"
	id("com.github.ben-manes.versions") version "0.15.0"
	`java-gradle-plugin`
	maven
	`embedded-kotlin`
	`kotlin-dsl`
}

buildScan {
	setLicenseAgreementUrl("https://gradle.com/terms-of-service")
	setLicenseAgree("yes")
}

//group = "com.github.ramonwirsch"
version = "0.1.12"

repositories {
	jcenter()
}

dependencies {
	compile("org.apache.avalon.framework:avalon-framework-impl:4.3.1")
	compile("org.apache.xmlgraphics:fop:1.1")
	runtime("net.sf.offo:fop-hyph:2.0")
	compile("xalan:xalan:2.7.2")
}

pluginBundle {
	website = "https://github.com/ramonwirsch/fopRenderer"
	vcsUrl = "https://github.com/ramonwirsch/fopRenderer"
	description = "Plugin that can render documents using Apache FOP. It can also validate XMLs against XSD schemas."
	tags = listOf("Apache FOP", "FOP", "XML", "XSD", "Validation", "XML Schema Validation")

	this.plugins {
		"fopRendererPlugin" {
			id = "com.github.ramonwirsch.FopRenderer"
			displayName = "FOP Renderer plugin"
		}
	}
}