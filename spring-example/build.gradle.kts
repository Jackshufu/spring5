plugins {
	id("java")
}

group = "org.springframework"
version = "5.2.19.RELEASE"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
	// 这里的引用依赖不是自己本地编译好的源码
	//	implementation group: 'org.springframework', name: 'spring-context', version: '5.2.18.RELEASE'
	// 如何引用项目内的module,借鉴源码内module相互依赖
	optional(project(":spring-context"))

}

tasks.getByName<Test>("test") {
	useJUnitPlatform()
}