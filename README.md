# devops-shopsmart-app
🛍️ ShopSmart — E-Commerce DevOps Automation Project

ShopSmart is a microservice-based e-commerce backend that I built using Spring Boot and MySQL.
This project helped me apply and understand the end-to-end DevOps workflow, from code commit to automated deployment in a cloud environment.

🎯 Project Objective

The main goal of this project was to automate the entire build, test, and deployment process of an application.
As soon as a developer pushes new code to the GitHub main branch, Jenkins automatically triggers the pipeline to:
✅ Pull the latest code
✅ Build and test it using Maven
✅ Containerize it using Docker
✅ Deploy it on a Kubernetes cluster
✅ Monitor it using Prometheus and Grafana

Through this, I got hands-on experience with continuous integration, continuous delivery, containerization, orchestration, and infrastructure monitoring — everything that a modern DevOps pipeline includes.

⚙️ Tech Stack Used
Category	Tools/Technologies
Backend Framework	Spring Boot (Java)
Database	MySQL
Build Tool	Maven
Version Control	Git & GitHub
CI/CD Tool	Jenkins
Containerization	Docker
Configuration Management	Ansible
Infrastructure as Code	Terraform
Container Orchestration	Kubernetes
Monitoring	Prometheus & Grafana
Testing	JUnit & Selenium
🧩 Application Overview

The ShopSmart application provides REST APIs for managing product data (name, price, and quantity).
It’s a simple e-commerce backend that allows CRUD operations — ideal for testing and automating DevOps pipelines.

🔑 Features

REST APIs for Product Management

MySQL Database Integration

Maven for Build & Dependency Management

Dockerized Application for Portability

Jenkins Pipeline for CI/CD Automation

Deployment on Kubernetes Cluster

Monitoring using Prometheus & Grafana Dashboards

🧱 Project Architecture

Below is the overall flow of the project:

Git Push → Jenkins Build → Maven Test → Docker Image Build → Push to DockerHub → 
Deploy to Kubernetes Cluster → Test (Selenium) → Monitor (Prometheus + Grafana)

🚀 CI/CD Workflow

Developer commits and pushes code to GitHub.

Jenkins webhook automatically triggers the pipeline.

Code is pulled, compiled, tested, and packaged using Maven.

Docker image is built and pushed to DockerHub.

Terraform provisions infrastructure (if needed).

Ansible configures servers and Kubernetes nodes.

The new Docker image is deployed on the Kubernetes test cluster.

Automated testing (Selenium) validates deployment.

Once validated, it automatically deploys to the production cluster.

Prometheus monitors the system, and metrics are visualized in Grafana.

🧰 Folder Structure (Example)
ShopSmart/
├── src/
├── Dockerfile
├── Jenkinsfile
├── ansible/
│   └── playbook.yml
├── terraform/
│   └── main.tf
├── k8s/
│   ├── deployment.yml
│   └── service.yml
└── README.md

🧑‍💻 My Learnings

While working on this project, I got hands-on experience with:

Automating end-to-end CI/CD pipelines

Integrating Docker with Jenkins

Writing Ansible playbooks for server setup

Deploying applications on Kubernetes

Setting up Prometheus and Grafana for real-time monitoring

It helped me understand how DevOps bridges development and operations, making software delivery faster and more reliable.

🌐 Future Enhancements

Integrate SonarQube for code quality analysis

Add Blue-Green Deployment strategy

Implement logging using ELK stack
